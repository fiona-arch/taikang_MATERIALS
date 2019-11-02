package com.example.config;

import com.example.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *   泰康保险(泰康在线财产保险股份有限公司)
 *   待上线域名taikang.com
 *   http://39.103.175.226/  admin:taikang
 *   huangye@taikang.com
 **/
@Configuration
public class ConfigAdapter implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*").excludePathPatterns("materils_v2.0/index.html");
    }
}
