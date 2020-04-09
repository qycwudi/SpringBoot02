package com.springbootdemo02.cfg;

import com.springbootdemo02.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author qyc
 * @time 2020/4/8 - 10:44
 */
@Configuration
public class MyInterceptorCfg implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/qyc/**").excludePathPatterns("/qyc/login");
    }
}
