package com.lcb.demo.sample.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcb.demo.sample.service.TestService;


/**
 * 类TestController.java的实现描述：demo
 *
 * @author zhaoxiaoliang 2020年4月19日 下午10:49:08
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Resource
    private TestService testService;

    /**
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/sayHello")
    public String sayHello(@RequestParam("name") String name) {
        return testService.sayHello(name);
    }
}
