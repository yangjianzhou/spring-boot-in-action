package test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by jianzhou.yang on 5/16/17.
 */

@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publish(){
        applicationContext.publishEvent(new DemoEvent(this ,"send msg"));
    }

}
