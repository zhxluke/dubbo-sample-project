package com.lcb.demo.sample;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类DemoApplication.java的实现描述：TODO 类实现描述 
 *
 * @author zhaoxiaoliang 2020年4月20日 下午5:53:36
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages="com.lcb.demo.sample.provider")
public class DubboSampleProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DubboSampleProviderBootstrap.class, args);
    }
}
