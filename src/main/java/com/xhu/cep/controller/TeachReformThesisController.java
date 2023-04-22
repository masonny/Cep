package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.component.JwtAuthenticationTokenFilter;
import com.xhu.cep.mbg.mapper.admin.UserTeachReformThesisMapper;
import com.xhu.cep.mbg.mapper.teach_reform_thesis.TeachReformThesisMapper;
import com.xhu.cep.mbg.model.admin.UserTeachReformThesis;
import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesis;
import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesisExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 教改论文
 * Created by mason on 2023/4/22
 */
@Controller
@Api(tags = "TeachReformThesisController", description = "教学业绩管理-教改论文")
@RequestMapping("/teachReformThesis")
public class TeachReformThesisController {
    @Autowired
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;
    @Autowired
    private TeachReformThesisMapper teachReformThesisMapper;
    @Autowired
    private UserTeachReformThesisMapper userTeachReformThesisMapper;

    @ApiOperation("获取论文类别列表")
    @RequestMapping(value = "className",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<TeachReformThesis>> getClassName(){
        return CommonResult.success(teachReformThesisMapper.selectByExample(new TeachReformThesisExample()));
    }

    @ApiOperation(value = "申报教改论文")
    @RequestMapping(value = "apply",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult apply(@RequestParam(value = "teachReformThesisId") Integer teachReformThesisId){
        jwtAuthenticationTokenFilter.getUserId();
        UserTeachReformThesis userTeachReformThesis = new UserTeachReformThesis();
        userTeachReformThesis.setUserId(jwtAuthenticationTokenFilter.getUserId());
        userTeachReformThesis.setTeachReformThesisId(teachReformThesisId);
        userTeachReformThesisMapper.insert(userTeachReformThesis);
        return CommonResult.success(userTeachReformThesis);
    }
}
