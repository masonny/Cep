package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.TeachCompet;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TeachCompetMapperTest {
@Test
    public void getTeachCompetAllTest() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);//自动提交方式
    TeachCompetMapper mapper = sqlSession.getMapper(TeachCompetMapper.class);

    List<TeachCompet> list = mapper.getTeachCompetAll();
    list.forEach(System.out::println);
}
}