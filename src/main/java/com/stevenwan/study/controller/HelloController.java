package com.stevenwan.study.controller;

import com.stevenwan.study.dto.BarCodePayDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/getInfo")
    public String hello(@RequestBody BarCodePayDTO barCodePayDTO) {
        return "java code annotation config";
    }

}
