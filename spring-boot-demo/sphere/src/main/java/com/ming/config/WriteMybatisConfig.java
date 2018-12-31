package com.ming.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * write Mybatis 配置信息
 * @author xu.mingming
 */
@Configuration
@MapperScan(basePackages = "com.ming.persistence.write", sqlSessionTemplateRef  = "writeSqlSessionTemplate")
public class WriteMybatisConfig {
    /**
     * 读取Mybatis xml配置信息使用
     * @return
     */
    @Bean
    public PathMatchingResourcePatternResolver resolver(){
        return new PathMatchingResourcePatternResolver();
    }

    /**
     * Mybatis 具体配置信息
     * @param dataSource
     * @param resolver
     * @return
     * @throws Exception
     */
    @Primary
    @Bean(name = "writeSqlSessionFactory")
    public SqlSessionFactory writeSqlSessionFactory(@Qualifier("writeDataSource") DataSource dataSource
            , ResourcePatternResolver resolver) throws Exception {

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        // 设置数据源
        bean.setDataSource(dataSource);
        // 设置xml sql 文件位置
//        bean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/write/*.xml"));
        // 设置数据实体位置
        // bean.setTypeAliasesPackage("com.ming.entity");

        return bean.getObject();
    }

    @Primary
    @Bean(name = "writeTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("writeDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "writeSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("writeSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
