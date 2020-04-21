package com.lcb.demo.sample;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Dubbo Registry ZooKeeper Consumer Bootstrap
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages="com.lcb.demo.sample.service.*")
public class TestApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
    
}
