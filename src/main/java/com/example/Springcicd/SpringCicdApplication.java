package com.example.Springcicd;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringCicdApplication {

    public static void main(String[] args) {
        log.info("Application executed........");
        log.info("just checking");
        SpringApplication.run(SpringCicdApplication.class, args);
    }

    @PostConstruct
    public void init() {
        log.info("Application Started.....");
        log.info("Application Started.....");
        log.info("Application Started.....");
        log.info("Hiii Asif .....");
    }

}
