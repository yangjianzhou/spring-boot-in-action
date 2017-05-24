package test.springCloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by yangjianzhou on 5/24/17 6:08 PM.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigApplication.class);

    }
}
