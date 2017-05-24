package test.springCloud.ui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yangjianzhou on 17-5-24.
 */

@Configuration
@PropertySource("classpath:springCloud/ui/application.properties")
public class UiConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
