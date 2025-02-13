package com.email.writer.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow cross-origin requests from the frontend
        registry.addMapping("/**")  // Allow CORS on all endpoints
                .allowedOrigins("http://localhost:5174")  // Allow only the frontend origin
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                .allowedHeaders("Content-Type")  // Allowed headers
                .allowCredentials(true);  // Allow credentials (cookies, authorization headers, etc.)
    }
}
