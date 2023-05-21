package org.qnapcn.qnapscraper.conf;

import org.qnapcn.qnapscraper.job.HelloJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfiguration {
    @Bean
    public Scheduler scheduler() throws SchedulerException {
        SchedulerFactory schedulerFactory = new org.quartz.impl.StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        // 创建定时任务
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                .withIdentity("helloJob")
                .build();

        // 创建触发器，设置每天上午10点执行
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("helloTrigger")
                .withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(9, 28))
                .build();

        // 将任务和触发器添加到调度器中
        scheduler.scheduleJob(jobDetail, trigger);

        return scheduler;
    }
}
