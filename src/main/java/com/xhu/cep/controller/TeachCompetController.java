package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonPage;
import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.common.utils.JwtTokenUtil;
import com.xhu.cep.component.JwtAuthenticationTokenFilter;
import com.xhu.cep.dto.UserTeachCompetParam;
import com.xhu.cep.mbg.mapper.admin.UserTeachCompetMapper;
import com.xhu.cep.mbg.mapper.teach_compet.CepTcOrganizerMapper;
import com.xhu.cep.mbg.mapper.teach_compet.CepTeachingCompetitionMapper;
import com.xhu.cep.mbg.model.admin.UserTeachCompet;
import com.xhu.cep.mbg.model.teach_compet.*;
import com.xhu.cep.service.CepTcNameService;
import com.xhu.cep.service.TeachCompetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mason on 2023/4/17
 */
@Api(tags = "TeachCompetController", description = "教学业绩管理-教学竞赛")
@Controller
@RequestMapping("/teachCompet")
public class TeachCompetController {
    @Autowired
    private TeachCompetService teachCompetService;
    @Autowired
    private CepTcNameService cepTcNameService;
    @Autowired
    private CepTcOrganizerMapper cepTcOrganizerMapper;
    @Autowired
    private CepTeachingCompetitionMapper cepTeachingCompetitionMapper;
    @Autowired
    private UserTeachCompetMapper userTeachCompetMapper;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    private static final Logger LOGGER = LoggerFactory.getLogger(TeachCompetController.class);

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

    @ApiOperation(value = "申报教学竞赛")
    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult applyTeachCompet(@RequestBody UserTeachCompetParam userTeachCompetParam) {
        //查询项目id
        CepTeachingCompetitionExample cepTeachingCompetitionExample = new CepTeachingCompetitionExample();
        cepTeachingCompetitionExample.createCriteria()
                .andTcNameIdEqualTo(Integer.parseInt(userTeachCompetParam.getTcNameId().toString()))
                .andOrganizerIdEqualTo(Integer.parseInt(userTeachCompetParam.getTcOrganId().toString()));
        List<CepTeachingCompetition> cepTeachingCompetitions = cepTeachingCompetitionMapper.selectByExample(cepTeachingCompetitionExample);
        if (cepTeachingCompetitions.size() == 0) {
            return CommonResult.failed("教学竞赛认定级别表没有此级别");
        }

        UserTeachCompet userTeachCompet = new UserTeachCompet();
        userTeachCompet.setUserId(jwtAuthenticationTokenFilter.getUserId());
        userTeachCompet.setTeachCompetId(cepTeachingCompetitions.get(0).getId());
        userTeachCompetMapper.insert(userTeachCompet);
        return CommonResult.success(userTeachCompet);
    }


    //@ApiOperation("获取教学竞赛认定级别列表")
    //@RequestMapping(value = "listAll", method = RequestMethod.GET)
    //@ResponseBody
    //@PreAuthorize("hasAuthority('cep:pro:read')")
    //public CommonResult<List<TeachCompet>> getTeachCompetAll() {
    //    return CommonResult.success(teachCompetService.getTeachCompetAll());
    //}

    /*@ApiOperation("添加比赛")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createBrand(@RequestBody CepTcName cepTcName) {
        CommonResult commonResult;
        int count = cepTcNameService.createTcName(cepTcName);
        if (count == 1) {
            commonResult = CommonResult.success(cepTcName);
            LOGGER.debug("createBrand success:{}", cepTcName);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", cepTcName);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id比赛名称信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody CepTcName cepTcName, BindingResult result) {
        CommonResult commonResult;
        int count = cepTcNameService.upDataTcName(id, cepTcName);
        if (count == 1) {
            commonResult = CommonResult.success(cepTcName);
            LOGGER.debug("updateBrand success:{}", cepTcName);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", cepTcName);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的比赛名称")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = cepTcNameService.deleteTcName(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }*/

    //@ApiOperation("获取指定id的比赛名称详情")
    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //@ResponseBody
    //public CommonResult<CepTcName> cepTcName(@PathVariable("id") Long id) {
    //    return CommonResult.success(cepTcNameService.getTcName(id));
    //}
}
