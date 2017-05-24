package test.webSocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by yangjianzhou on 17-5-21.
 */

@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public Response say(Message msg) throws Exception {
        Thread.sleep(1000);
        return new Response("welcome , " + msg.getName());
    }
}
