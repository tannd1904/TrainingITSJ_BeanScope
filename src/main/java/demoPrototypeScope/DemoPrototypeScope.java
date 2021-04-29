package demoPrototypeScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoPrototypeScope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();

        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean.hashCode());
        context.close();
    }
}
