package com.example.springscheduled.job.simple;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by mtumilowicz on 2018-07-22.
 */
@ScheduledJob
public class SimpleJob {
    
    @Scheduled(fixedRate = 2000)
    public void simpleJob() {
        System.out.println("SampleJob invoked!");
    }
    
}
