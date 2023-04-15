package com.xhu.cep.config.controller;

import com.xhu.cep.common.api.CommonPage;
import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.mbg.mapper.tc.CepTcNameMapper;
import com.xhu.cep.mbg.model.tc.CepTcName;
import com.xhu.cep.service.CepTcNameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mason on 2023/4/15
 */
@Controller
@RequestMapping("/tcName")
public class CepTcNameController {
    @Autowired
    private CepTcNameService cepTcNameService;

    private static final Logger LOGGER = LoggerFactory.getLogger(CepTcNameController.class);

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CepTcName>> getCepTcNameList() {
        return CommonResult.success(cepTcNameService.listAllTcName());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createBrand(@RequestBody CepTcName cepTcName) {
        CommonResult commonResult;
        int count = cepTcNameService.createTcName(cepTcName);
        if (count == 1) {
            commonResult = CommonResult.success(cepTcName);
            LOGGER.debug("createBrand success:{}", cepTcName);
        } else {
            commonResult = CommonResult.failed("²Ù×÷Ê§°Ü");
            LOGGER.debug("createBrand failed:{}", cepTcName);
        }
        return commonResult;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody CepTcName cepTcName, BindingResult result) {
        CommonResult commonResult;
        int count = cepTcNameService.upDataTcName(id, cepTcName);
        if (count == 1) {
            commonResult = CommonResult.success(cepTcName);
            LOGGER.debug("updateBrand success:{}", cepTcName);
        } else {
            commonResult = CommonResult.failed("²Ù×÷Ê§°Ü");
            LOGGER.debug("updateBrand failed:{}", cepTcName);
        }
        return commonResult;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = cepTcNameService.deleteTcName(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("²Ù×÷Ê§°Ü");
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<CepTcName>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<CepTcName> cepTcNameList = cepTcNameService.listTcName(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(cepTcNameList));
    }
}
