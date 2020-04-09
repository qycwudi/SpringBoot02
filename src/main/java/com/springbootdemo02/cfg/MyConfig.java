package com.springbootdemo02.cfg;

import com.springbootdemo02.interceptor.UserInterceptor;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author qyc
 * @time 2020/4/7 - 5:04
 */

//@Configuration
//public class MyConfig implements WebMvcConfigurer {
public class MyConfig extends WebMvcConfigurationSupport {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/in").setViewName("/index");
    }






}
