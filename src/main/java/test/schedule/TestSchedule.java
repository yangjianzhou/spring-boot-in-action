package test.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yangjianzhou on 17-5-16.
 */
public class TestSchedule {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ScheduledTaskService.class);
    }
}
