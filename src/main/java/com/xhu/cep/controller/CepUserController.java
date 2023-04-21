package com.xhu.cep.controller;

import com.xhu.cep.common.api.CommonResult;
import com.xhu.cep.dto.CepUserLoginParam;
import com.xhu.cep.dto.MinioUploadDto;
import com.xhu.cep.mbg.mapper.admin.CepRoleMapper;
import com.xhu.cep.mbg.mapper.admin.CepUserMapper;
import com.xhu.cep.mbg.model.admin.CepProjectPermisson;
import com.xhu.cep.mbg.model.admin.CepRole;
import com.xhu.cep.mbg.model.admin.CepRoleExample;
import com.xhu.cep.mbg.model.admin.CepUser;
import com.xhu.cep.service.CepUserService;
import io.minio.MinioClient;
import io.minio.policy.PolicyType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台员工管理
 * Created by mason on 2023/4/21
 */
@Controller
@Api(tags = "CepUserController", description = "后台用户管理")
@RequestMapping("/user")
public class CepUserController {
    @Autowired
    private CepUserService cepUserService;
    @Autowired
    private CepRoleMapper cepRoleMapper;
    @Autowired
    private CepUserMapper cepUserMapper;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Value("${minio.endpoint}")
    private String ENDPOINT;
    @Value("${minio.bucketName}")
    private String BUCKET_NAME;
    @Value("${minio.accessKey}")
    private String ACCESS_KEY;
    @Value("${minio.secretKey}")
    private String SECRET_KEY;
    private static final Logger LOGGER = LoggerFactory.getLogger(CepUserController.class);

    @ApiOperation(value = "员工注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<CepUser> register(@RequestBody CepUser cepUserParam, BindingResult result) {
        CepUser cepUser = cepUserService.register(cepUserParam);
        if (cepUser == null) {
            CommonResult.failed();
        }
        return CommonResult.success(cepUser);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody CepUserLoginParam cepUserLoginParam, BindingResult result) {
        String token = cepUserService.login(cepUserLoginParam.getUsername(), cepUserLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取员工所有权限")
    @RequestMapping(value = "/permission/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CepProjectPermisson>> getPermissionList(@PathVariable Long userId) {
        List<CepProjectPermisson> permissionList = cepUserService.getPermissionList(userId);
        return CommonResult.success(permissionList);
    }

    @ApiOperation("文件上传")
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult upload(@RequestParam("file") MultipartFile file) {
        try {
            //创建一个MinIO的Java客户端
            MinioClient minioClient = new MinioClient(ENDPOINT, ACCESS_KEY, SECRET_KEY);
            boolean isExist = minioClient.bucketExists(BUCKET_NAME);
            if (isExist) {
                LOGGER.info("存储桶已经存在！");
            } else {
                //创建存储桶并设置只读权限
                minioClient.makeBucket(BUCKET_NAME);
                minioClient.setBucketPolicy(BUCKET_NAME, "*.*", PolicyType.READ_ONLY);
            }
            String filename = file.getOriginalFilename();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            // 设置存储对象名称
            String objectName = sdf.format(new Date()) + "/" + filename;
            // 使用putObject上传一个文件到存储桶中
            minioClient.putObject(BUCKET_NAME, objectName, file.getInputStream(), file.getContentType());
            LOGGER.info("文件上传成功!");
            MinioUploadDto minioUploadDto = new MinioUploadDto();
            minioUploadDto.setName(filename);
            minioUploadDto.setUrl(ENDPOINT + "/" + BUCKET_NAME + "/" + objectName);
            return CommonResult.success(minioUploadDto);
        } catch (Exception e) {
            LOGGER.info("上传发生错误: {}！", e.getMessage());
        }
        return CommonResult.failed();
    }

    @ApiOperation("文件删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("objectName") String objectName) {
        try {
            MinioClient minioClient = new MinioClient(ENDPOINT, ACCESS_KEY, SECRET_KEY);
            minioClient.removeObject(BUCKET_NAME, objectName);
            return CommonResult.success(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取所有角色")
    @RequestMapping(value = "/role/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CepRole>> getTeachCompetAll() {
        return CommonResult.success(cepRoleMapper.selectByExample(new CepRoleExample()));
    }

    @ApiOperation("获取员工信息")
    @RequestMapping(value = "/userInfo/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CepUser> getUserInfo(@PathVariable Long userId) {
        return CommonResult.success(cepUserMapper.selectByPrimaryKey(userId));
    }


}
