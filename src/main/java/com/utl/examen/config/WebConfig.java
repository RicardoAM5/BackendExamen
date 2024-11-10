package com.utl.examen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://soft-madeleine-56c337.netlify.app/") // URL de tu frontend desplegado
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}