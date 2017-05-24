package test.springCloud.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
@PropertySource("classpath:springCloud/some/application.properties")
@RestController
public class SomeApplication {
    @Value("${my.message}") //1
    private String message;

    @RequestMapping(value = "/getSome")
    public String getSome() {
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class, args);
    }

}
