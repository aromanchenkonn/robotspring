package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Object object = context.getBean("t1000");
		if(object instanceof ModelT1000){
			ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
			t1000.action();
		}
	}
}
