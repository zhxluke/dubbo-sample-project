package com.lcb.demo.sample;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Dubbo Registry Nacos Consumer Bootstrap
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages="com.lcb.demo.sample.service")
public class DubboSampleConsumerBootstrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(DubboSampleConsumerBootstrap.class, args);
    }
    
}
