package com.xhu.cep.controller;

import com.xhu.cep.mbg.mapper.teach_compet.CepTcNameMapper;
import com.xhu.cep.mbg.model.teach_compet.CepTcName;
import com.xhu.cep.mbg.model.teach_compet.CepTcNameExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TeachCompetControllerTest {
    @Test
    public void getCepTcNameList() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//自动提交方式
        CepTcNameMapper mapper = sqlSession.getMapper(CepTcNameMapper.class);
        List<CepTcName> list = mapper.selectByExample(new CepTcNameExample());

        list.forEach(System.out::println);
    }
}