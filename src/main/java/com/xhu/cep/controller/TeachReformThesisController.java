package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.mbg.model.teach_reform_thesis.TeachReformThesis;
import com.xhu.cep.service.TeachReformThesisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mason on 2023/4/17
 */
@Api(tags = "TeachReformThesisController", description = "教学业绩管理-教改论文")
@Controller
@RequestMapping("/teachReformThesis")
public class TeachReformThesisController {
    @Autowired
    private TeachReformThesisService teachReformThesisService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TeachCompetController.class);

    @ApiOperation("获取教研教改论文列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<TeachReformThesis>> getCepTcNameAllList() {
        return CommonResult.success(teachReformThesisService.getTeachReformThesisAll());
    }
}
