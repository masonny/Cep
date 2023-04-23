package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.mbg.model.research_project.RpClassifi;
import com.xhu.cep.mbg.model.research_project.RpProjectSource;
import com.xhu.cep.service.ResearchProjectService;
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
 * Created by mason on 2023/4/23
 */
@Controller
@Api(tags = "ResearchProjectController", description = "科研业绩管理-科研项目")
@RequestMapping(value = "researchProject")
public class ResearchProjectController {
    @Autowired
    private ResearchProjectService researchProjectService;

    @ApiOperation(value = "获取类别列表")
    @RequestMapping(value = "/classListAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<RpClassifi>> getRpClassifi() {
        return CommonResult.success(researchProjectService.getRpClassifi());
    }

    @ApiOperation(value = "获取项目来源列表")
    @RequestMapping(value = "/proSouListAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<List<RpProjectSource>> getRpProjectSource(
            @RequestParam(value = "rpClassId") Long rpClassId) {
        return CommonResult.success(researchProjectService.getRpProjectSource(rpClassId));
    }

    @ApiOperation(value = "申报")
    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult apply(
            @RequestParam(value = "rpClassId") Long rpClassId,
            @RequestParam(value = "rpProSouId") Long rpProSouId) {
        if (researchProjectService.apply(rpClassId, rpProSouId) == 0){
            return CommonResult.success("成功");
        }
        return CommonResult.failed();
    }
}