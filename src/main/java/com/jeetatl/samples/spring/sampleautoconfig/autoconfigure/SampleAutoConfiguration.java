package com.jeetatl.samples.spring.sampleautoconfig.autoconfigure;

import com.jeetatl.samples.spring.sampleautoconfig.bean.AutoCBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties(SampleProperties.class)
public class SampleAutoConfiguration {

    private SampleProperties properties;

    public SampleAutoConfiguration(SampleProperties properties) {
        this.properties = properties;
    }

    @Bean("sampleProp2")
    public Integer getSampleProper2() {
        return new Integer(this.properties.getProp2());
    }

    @Bean("sampleProp1")
    public String getSampleProp1() {
        return new String(this.properties.getProp1());
    }

    @Bean
    public AutoCBean getAutoCBean() {
        return new AutoCBean(properties.getProp2(), properties.getProp1());
    }

    @PostConstruct
    public void printProperties() {
        System.out.println(properties);
    }

}
