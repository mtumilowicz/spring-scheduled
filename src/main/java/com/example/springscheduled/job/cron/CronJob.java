package com.example.springscheduled.job.cron;

import com.example.springscheduled.job.simple.ScheduledJob;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by mtumilowicz on 2018-07-22.
 */
@ScheduledJob
public class CronJob {
    
    @Scheduled(cron = "* * 20 * * ?")
    public void cronJob() {
        System.out.println("CronJob invoked!");
    }
}
