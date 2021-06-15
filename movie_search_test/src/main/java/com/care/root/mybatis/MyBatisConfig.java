package com.care.root.mybatis;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.care.root.dao"})
public class MyBatisConfig {
   @Bean
   public SqlSessionFactory seqSessionFactory(DataSource dataSource) 
                                          throws Exception {
      final SqlSessionFactoryBean sessionFactory = 
                           new SqlSessionFactoryBean();
      sessionFactory.setDataSource(dataSource);
      return sessionFactory.getObject();
   }
   @Bean
   public SqlSessionTemplate sqlSessionTemplate(
                           SqlSessionFactory sqlSessionFactory) {
      return new SqlSessionTemplate(sqlSessionFactory);
   }
}