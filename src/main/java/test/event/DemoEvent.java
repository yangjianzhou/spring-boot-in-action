package test.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by jianzhou.yang on 5/16/17.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;


    public DemoEvent(Object object, String msg) {
        super(object);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
