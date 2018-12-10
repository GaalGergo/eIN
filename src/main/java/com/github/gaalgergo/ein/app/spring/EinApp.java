package com.github.gaalgergo.ein.app.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.github.gaalgergo.ein.app")
@EntityScan(basePackages = "com.github.gaalgergo.ein.app")
@EnableJpaRepositories(basePackages = "com.github.gaalgergo.ein.app.repository")
public class EinApp {
    public static void main(final String... args) {
        SpringApplication.run(EinApp.class, args);
    }
}
