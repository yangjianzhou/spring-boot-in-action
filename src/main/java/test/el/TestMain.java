package test.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by drjr on 5/16/17.
 */
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = (ELConfig)context.getBean("ELConfig");
        System.out.println(elConfig.getBookName());
    }
}
