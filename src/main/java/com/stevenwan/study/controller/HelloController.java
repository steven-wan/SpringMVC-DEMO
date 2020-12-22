package com.stevenwan.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author steven-wan
 * @desc
 * @date 2020-12-22 17:18
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/getInfo")
    public String hello() {
        return "java code annotation config";
    }

}
