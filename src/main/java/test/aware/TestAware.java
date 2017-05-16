package test.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yangjianzhou on 17-5-16.
 */
public class TestAware {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareService.class);
        AwareService awareService = (AwareService) context.getBean("awareService");
        awareService.printResult();
        context.close();
    }
}
