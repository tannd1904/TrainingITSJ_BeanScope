package demoSessionScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Student newStudent() {
        return new Student("N17DCCN150", "Tan", "D17CQCP02");
    }
}
