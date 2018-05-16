package com.pupiq.restfordiploma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestForDiplomaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestForDiplomaApplication.class, args);
    }
}
