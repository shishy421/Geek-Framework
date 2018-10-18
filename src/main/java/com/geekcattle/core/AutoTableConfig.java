package com.geekcattle.core;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*"})
@MapperScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.dao.*"}, sqlSessionFactoryRef = "sqlSessionFactory")
public class AutoTableConfig {
    @Bean
    public PropertiesFactoryBean configProperties() throws Exception{
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        propertiesFactoryBean.setLocations(resolver.getResources("classpath*:autotable.properties"));
        return propertiesFactoryBean;
    }

}
