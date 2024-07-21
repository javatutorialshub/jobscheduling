package com.javatutorialshub.jobscheduling.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberExtractor {

    private static final Logger logger = LoggerFactory.getLogger(RandomNumberExtractor.class);

    @Scheduled(cron = "0 * * * * *")
    public void doExtraction(){
        new Random().doubles(10).findFirst().ifPresent(d -> {
            double value = d * System.currentTimeMillis();
            logger.info("Result: {}", value);
        });
    }
}
