package com.xhu.cep.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 */
@Configuration
@MapperScan("com.xhu.cep.mbg.mapper.*")
public class MyBatisConfig {

}
