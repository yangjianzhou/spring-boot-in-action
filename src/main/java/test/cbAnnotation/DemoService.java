package test.cbAnnotation;

/**
 * Created by yangjianzhou on 17-5-16.
 */

@CombinedConfiguration(value = "test.cbAnnotation")
public class DemoService {

    public void printResult() {
        System.out.println("get bean from combined configuration");
    }
}
