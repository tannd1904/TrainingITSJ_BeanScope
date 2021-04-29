package demoPrototypeScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("prototype")
    public MyBean myBean() {
        return new MyBean();
    }
}
