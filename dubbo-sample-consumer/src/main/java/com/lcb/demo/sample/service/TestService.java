package com.lcb.demo.sample.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcb.demo.sample.service.remote.DemoServiceRemote;

/**
 * 类UserService.java的实现描述：TODO 类实现描述
 *
 * @author zhaoxiaoliang 2020年4月20日 下午4:48:27
 */
@Service
public class TestService {
    
    @Resource
    private DemoServiceRemote demoServiceRemote;

    public String sayHello(String name) {
        return demoServiceRemote.sayHello(name);
    }
}
