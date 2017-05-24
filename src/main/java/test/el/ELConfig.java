package test.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by drjr on 5/16/17.
 */

@Configuration
@ComponentScan("test.el")
@PropertySource("classpath:/test/el/el.properties")
public class ELConfig {

    @Value("zhangSan")
    private String name;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("${book.name}")
    private String bookName;

    public String getName() {
        return name;
    }

    public String getOsName() {
        return osName;
    }

    public String getBookName() {
        return bookName;
    }
}
