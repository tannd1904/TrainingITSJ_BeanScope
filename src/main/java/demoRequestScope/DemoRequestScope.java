package demoRequestScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoRequestScope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();

        Intern intern = context.getBean(Intern.class);
        System.out.println(intern.getName());
    }
}
