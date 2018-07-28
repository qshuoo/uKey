package com.qys.ukey.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 配置Bean
 * @Auther : qiaoyongshuo
 * @Date : 2018/7/28
 */
@Configuration
public class BeanConfig {

    /**
     * 注入数据源
     * @return dataSource
     */
    @Bean("dataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource dataSourceBean() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 注入JdbcTemplate
     * @param dataSource 数据源
     * @return JdbcTemplate
     */
    @Bean("jdbcTemplate")
    public JdbcTemplate jdbcTemplateBean(@Qualifier("dataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
