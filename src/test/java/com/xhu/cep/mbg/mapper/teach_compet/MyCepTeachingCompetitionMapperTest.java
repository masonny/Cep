package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.CepTeachingCompetition;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyCepTeachingCompetitionMapperTest {
    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//自动提交方式
        MyCepTeachingCompetitionMapper mapper = sqlSession.getMapper(MyCepTeachingCompetitionMapper.class);

        List<CepTeachingCompetition> list = mapper.getTeachCompet();
        list.forEach(System.out::println);
    }
}