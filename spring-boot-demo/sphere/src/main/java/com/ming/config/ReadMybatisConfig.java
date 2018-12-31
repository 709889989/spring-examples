package com.ming.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * read Mybatis 配置信息
 * @author xu.mingming
 */
@Configuration
@MapperScan(basePackages = "com.ming.persistence.read", sqlSessionTemplateRef  = "readSqlSessionTemplate")
public class ReadMybatisConfig {

    @Bean(name = "readSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("readDataSource") DataSource dataSource
            , ResourcePatternResolver resolver) throws Exception {

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();

        bean.setDataSource(dataSource);
        // xml 文件位置
//        bean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/read/*.xml"));

        return bean.getObject();
    }

    @Bean(name = "readTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("readDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "readSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("readSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
