package com.lcb.demo.sample.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcb.demo.sample.service.UserService;

/**
 * 类DemoApi.java的实现描述：TODO 类实现描述
 *
 * @author zhaoxiaoliang 2020年4月20日 下午4:51:42
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/query")
    public String queryUser(@RequestParam("name") String name) {
        return userService.query(name);
    }
}
