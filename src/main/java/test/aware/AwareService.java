package test.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by yangjianzhou on 17-5-16.
 */

@Configuration
@ComponentScan("test.aware")
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void printResult() {
        System.out.println("Bean name is : " + beanName);
        Resource resource = loader.getResource("/test/aware/test.txt");
        try {
            System.out.println(" content of file loaded by resourceLoader is : " + IOUtils.toString(resource.getInputStream()));
        } catch (Exception exp) {

        }
    }
}
