package com.javachat.websocket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JavaChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaChatApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**")
                        .allowCredentials(true)
                        .allowedOrigins("https://yoramhernalsteen.github.io", "http://localhost:3000")
                        .allowedMethods("*");
            }
        };
    }

}
