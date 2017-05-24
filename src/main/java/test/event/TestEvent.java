package test.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jianzhou.yang on 5/16/17.
 */
public class TestEvent {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = (DemoPublisher) context.getBean("demoPublisher");
        publisher.publish();
    }
}
