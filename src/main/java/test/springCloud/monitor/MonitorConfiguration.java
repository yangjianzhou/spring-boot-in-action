package test.springCloud.monitor;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by yangjianzhou on 17-5-24.
 */

@Configuration
@PropertySource("classpath:springCloud/monitor/application.properties")
public class MonitorConfiguration {
}
