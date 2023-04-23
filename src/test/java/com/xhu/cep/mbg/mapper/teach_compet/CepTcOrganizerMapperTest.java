package com.xhu.cep.mbg.mapper.teach_compet;

import com.xhu.cep.mbg.model.teach_compet.CepTcOrganizer;
import com.xhu.cep.mbg.model.teach_compet.CepTcOrganizerExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CepTcOrganizerMapperTest {
    @Test
    public void selectByExample() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        CepTcOrganizerMapper mapper = sqlSession.getMapper(CepTcOrganizerMapper.class);
        CepTcOrganizerExample cepTcOrganizerExample = new CepTcOrganizerExample();
        cepTcOrganizerExample.createCriteria().andTcNameIdEqualTo(2);
        List<CepTcOrganizer> list = mapper.selectByExample(cepTcOrganizerExample);
        list.forEach(System.out::println);
    }
}