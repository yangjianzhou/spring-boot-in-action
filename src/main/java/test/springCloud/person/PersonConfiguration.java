package test.springCloud.person;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by yangjianzhou on 17-5-24.
 */

@Configuration
@PropertySource("classpath:springCloud/person/application.properties")
public class PersonConfiguration {
}
