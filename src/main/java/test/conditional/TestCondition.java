package test.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yangjianzhou on 17-5-16.
 */
public class TestCondition {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + " listCmd : " + listService.getListCmd());
    }
}
