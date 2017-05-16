package test.cbAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yangjianzhou on 17-5-16.
 */
public class TestCombinedConfiguration {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoService.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.printResult();
        context.close();
    }
}
