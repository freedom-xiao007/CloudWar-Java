package com.cloud.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CloudWarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudWarApplication.class, args);
    }

}
