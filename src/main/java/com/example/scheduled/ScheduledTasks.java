package com.example.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedDelay = 6000)
    public void reportCurrentTime() {
        System.out.println("The time is -: "+ dateFormat.format(new Date()));
    }

    @Scheduled(cron="*/10 * * * * *")
    public void doSomething() {
        System.out.println("LOL");
    }
}
