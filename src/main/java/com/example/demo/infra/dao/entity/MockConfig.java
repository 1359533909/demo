package com.example.demo.infra.dao.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mock.properties")
//@ConfigurationProperties(prefix = "mock")
@Data
public class MockConfig {
    private Integer age;
    private String name;
}
