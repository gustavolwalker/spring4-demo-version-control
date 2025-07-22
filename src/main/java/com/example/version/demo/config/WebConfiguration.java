package com.example.version.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(WebConfiguration.class);

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {

        log.info("Configuring API versioning...");
        configurer.useRequestHeader("X-API-Version");
    }
}
