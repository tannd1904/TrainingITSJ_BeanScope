package demoSessionScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSessionScope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();

        Student student = context.getBean(Student.class);
        System.out.println(student.getName() + student.getIdStudent());
    }
}
