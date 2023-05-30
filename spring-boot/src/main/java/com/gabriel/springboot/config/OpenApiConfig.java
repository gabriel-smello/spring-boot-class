package com.gabriel.springboot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("RESTful API with Java 18 and Spring Boot 4")
                        .version("v1").description("Descrição sobre minha API")
                        .termsOfService("https://google.com")
                        .license(
                                new License()
                                        .name("Apache 2.0")
                                        .url("https://google.com")
                        ));
    }
}
