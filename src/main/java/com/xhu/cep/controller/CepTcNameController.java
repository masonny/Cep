package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonPage;
import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.mbg.model.tc.CepTcName;
import com.xhu.cep.service.CepTcNameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 教学竞赛比赛名称Controller
 * Created by mason on 2023/4/15
 */
@Api(tags = "CepTcNameController", description = "教学比赛名称管理")
@Controller
@RequestMapping("/tcName")
public class CepTcNameController {
    @Autowired
    private CepTcNameService cepTcNameService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CepTcNameController.class);

    @ApiOperation("获取所有比赛名称列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CepTcName>> getCepTcNameList() {
        return CommonResult.success(cepTcNameService.listAllTcName());
    }

    @ApiOperation("添加比赛")
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

    @ApiOperation("更新指定id比赛信息")
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

    @ApiOperation("删除指定id的比赛")
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
    }

    @ApiOperation("分页查询比赛列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CepTcName>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<CepTcName> cepTcNameList = cepTcNameService.listTcName(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(cepTcNameList));
    }

    @ApiOperation("获取指定id的比赛详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CepTcName> cepTcName(@PathVariable("id") Long id) {
        return CommonResult.success(cepTcNameService.getTcName(id));
    }
}
