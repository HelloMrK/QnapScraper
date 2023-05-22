package org.qnapcn.qnapscraper.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class HelloJob {

    @Scheduled(cron = "* * * * * *")
    void test(){
        System.out.println("hello");
    }
}