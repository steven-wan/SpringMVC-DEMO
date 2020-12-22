package com.stevenwan.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author steven-wan
 * @desc
 * @date 2020-12-01 16:25
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.stevenwan.study"})
public class WebConfig {
}
