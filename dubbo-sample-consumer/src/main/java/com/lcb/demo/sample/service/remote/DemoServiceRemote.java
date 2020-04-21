package com.lcb.demo.sample.service.remote;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import com.lcb.demo.sample.provider.DemoService;

/**
 * Default {@link DemoService}
 *
 * @see DemoService
 * @since 2.7.0
 */
@Service
public class DemoServiceRemote{

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}