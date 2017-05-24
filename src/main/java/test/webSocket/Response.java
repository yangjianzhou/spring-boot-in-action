package test.webSocket;

/**
 * Created by yangjianzhou on 17-5-21.
 */
public class Response {

    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
