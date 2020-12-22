package com.stevenwan.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author steven-wan
 * @desc
 * @date 2020-12-21 17:01
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/getInfo")
    public String hello() {
        return "hellow worlds";
    }

}
