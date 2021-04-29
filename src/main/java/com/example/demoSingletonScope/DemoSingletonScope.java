package com.example.demoSingletonScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoSingletonScope {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.register(BeanConfig.class);
		context.refresh();

		Person ps1 = context.getBean(Person.class);
		ps1.setName("TAN");
		System.out.println(ps1.getName());
		context.close();
	}

}
