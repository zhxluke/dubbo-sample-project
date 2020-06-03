package com.lcb.demo.sample.provider;

import javax.annotation.Resource;

import org.apache.dubbo.config.annotation.DubboService;

import com.lcb.demo.sample.service.UserService;

/**
 * 类DemoServiceImpl.java的实现描述：TODO 类实现描述 
 *
 * @author zhaoxiaoliang 2020年4月20日 下午5:24:37
 */
@DubboService(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    
    @Resource
    private UserService userService;
    
    public String sayHello(String name) {
        return String.format("Hello, %s", userService.query(name));
    }
}
