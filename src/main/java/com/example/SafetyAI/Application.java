package com.example.SafetyAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.example.SafetyAI")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // ✅ GLOBAL CORS FIX
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")   // you can replace with your Vercel URL later
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}