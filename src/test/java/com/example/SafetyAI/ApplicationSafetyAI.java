package com.example.SafetyAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// ✅ FIX: Added scanBasePackages
@SpringBootApplication(scanBasePackages = "com.example.SafetyAI")
public class ApplicationSafetyAI {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSafetyAI.class, args);
    }

    // ✅ CORS config (keep this)
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}