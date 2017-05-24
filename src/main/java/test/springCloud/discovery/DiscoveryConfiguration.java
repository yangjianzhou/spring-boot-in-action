package test.springCloud.discovery;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by yangjianzhou on 17-5-24.
 */

@Configuration
@PropertySource("classpath:springCloud/discovery/application.properties")
public class DiscoveryConfiguration {

}
