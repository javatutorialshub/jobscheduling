package com.javatutorialshub.jobscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobschedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobschedulingApplication.class, args);
    }

}
