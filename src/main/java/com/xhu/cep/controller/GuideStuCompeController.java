package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonPage;
import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.component.JwtAuthenticationTokenFilter;
import com.xhu.cep.dto.UserGuideStuCompeParam;
import com.xhu.cep.mbg.mapper.admin.UserGuideStuCompeMapper;
import com.xhu.cep.mbg.mapper.guide_stu_compe.GuideStuCompeJMapper;
import com.xhu.cep.mbg.mapper.guide_stu_compe.TeamIndivLargeMapper;
import com.xhu.cep.mbg.mapper.teach_compet.CepTcOrganizerMapper;
import com.xhu.cep.mbg.mapper.teach_compet.CepTeachingCompetitionMapper;
import com.xhu.cep.mbg.model.admin.UserGuideStuCompe;
import com.xhu.cep.mbg.model.admin.UserTeachCompet;
import com.xhu.cep.mbg.model.guide_stu_compe.GuideStuCompeJ;
import com.xhu.cep.mbg.model.guide_stu_compe.GuideStuCompeJExample;
import com.xhu.cep.mbg.model.guide_stu_compe.TeamIndivLarge;
import com.xhu.cep.mbg.model.guide_stu_compe.TeamIndivLargeExample;
import com.xhu.cep.mbg.model.teach_compet.*;
import com.xhu.cep.service.CepTcNameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mason on 2023/4/22
 */
@Controller
@Api(tags = "GuideStuCompe", description = "教学业绩管理-指导学生竞赛")
@RequestMapping("/guideStuCompe")
public class GuideStuCompeController {
    @Autowired
    private CepTcNameService cepTcNameService;
    @Autowired
    private CepTcOrganizerMapper cepTcOrganizerMapper;
    @Autowired
    private CepTeachingCompetitionMapper cepTeachingCompetitionMapper;
    @Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;
    @Autowired
    private UserGuideStuCompeMapper userGuideStuCompeMapper;
    @Autowired
    private TeamIndivLargeMapper teamIndivLargeMapper;
    @Autowired
    private GuideStuCompeJMapper guideStuCompeJMapper;

    @ApiOperation("获取比赛名称列表")
    @RequestMapping(value = "nameListAll", method = RequestMethod.GET)
    @ResponseBody
    //@PreAuthorize("hasAuthority('cep:pro:read')")
    public CommonResult<List<CepTcName>> getNameListAll() {
        return CommonResult.success(cepTcNameService.nameListAll());
    }

    @ApiOperation("获取比赛名称列表-分页查询")
    @RequestMapping(value = "/nameList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CepTcName>> listName(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<CepTcName> cepTcNameList = cepTcNameService.listTcName(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(cepTcNameList));
    }

    @ApiOperation("获取主办单位列表")
    @RequestMapping(value = "/organList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CepTcOrganizer>> getOrganList(@RequestParam(value = "tcNameId") Integer tcNameId) {
        CepTcOrganizerExample cepTcOrganizerExample = new CepTcOrganizerExample();
        cepTcOrganizerExample.createCriteria().andTcNameIdEqualTo(tcNameId);
        return CommonResult.success(cepTcOrganizerMapper.selectByExample(cepTcOrganizerExample));
    }

    @ApiOperation("获取奖励标准J值列表")
    @RequestMapping(value = "/teamIndivLarge", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<TeamIndivLarge>> getTeamIndivLarge(@RequestParam(value = "idenLevelId") Integer idenLevelId) {
        GuideStuCompeJExample guideStuCompeJExample = new GuideStuCompeJExample();
        guideStuCompeJExample.createCriteria().andIdentificationLevelIdEqualTo(idenLevelId);
        List<GuideStuCompeJ> guideStuCompeJS = guideStuCompeJMapper.selectByExample(guideStuCompeJExample);
        List<Long> longs = new ArrayList<>();
        for (GuideStuCompeJ g : guideStuCompeJS) {
            longs.add(g.getTeamIndivLargeId());
        }
        TeamIndivLargeExample teamIndivLargeExample = new TeamIndivLargeExample();
        teamIndivLargeExample.createCriteria().andIdIn(longs);
        List<TeamIndivLarge> teamIndivLarges = teamIndivLargeMapper.selectByExample(teamIndivLargeExample);
        return CommonResult.success(teamIndivLarges);
    }

    @ApiOperation(value = "申报指导学生竞赛")
    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult applyTeachCompet(@RequestBody UserGuideStuCompeParam userGuideStuCompeParam) {
        //查询项目id
        CepTeachingCompetitionExample cepTeachingCompetitionExample = new CepTeachingCompetitionExample();
        cepTeachingCompetitionExample.createCriteria()
                .andTcNameIdEqualTo(Integer.parseInt(userGuideStuCompeParam.getTcNameId().toString()))
                .andOrganizerIdEqualTo(Integer.parseInt(userGuideStuCompeParam.getTcOrganId().toString()));
        List<CepTeachingCompetition> cepTeachingCompetitions = cepTeachingCompetitionMapper.selectByExample(cepTeachingCompetitionExample);
        if (cepTeachingCompetitions.size() == 0) {
            return CommonResult.failed("教学竞赛认定级别表没有此级别");
        }
        UserTeachCompet userTeachCompet = new UserTeachCompet();
        userTeachCompet.setUserId(jwtAuthenticationTokenFilter.getUserId());
        userTeachCompet.setTeachCompetId(cepTeachingCompetitions.get(0).getId());
        //userTeachCompetMapper.insert(userTeachCompet);

        UserGuideStuCompe userGuideStuCompe = new UserGuideStuCompe();
        userGuideStuCompe.setUserId(jwtAuthenticationTokenFilter.getUserId());
        userGuideStuCompe.setGuideStuCompeId(cepTeachingCompetitions.get(0).getId());
        userGuideStuCompe.setTeamIndivLargeId(Long.valueOf(userGuideStuCompeParam.getTeamIndivLargesId()));
        userGuideStuCompeMapper.insert(userGuideStuCompe);
        return CommonResult.success(userGuideStuCompe);
    }
}
