package test.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yangjianzhou on 17-5-16.
 */

@Configuration
@ComponentScan("test.schedule")
@EnableScheduling
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void fixRateExecute(){
        System.out.println("every 5s execute once ," + sdf.format(new Date()));
    }

    @Scheduled(cron = " 0 56 21 ? * *")
    public void fixTimeExecute(){
        System.out.println("execute at specify time ," + sdf.format(new Date()));
    }
}
