package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextSony.xml");
		Object object = context.getBean("t1000");
		if(object instanceof ModelT1000){
			ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
			t1000.action();
		}

		ApplicationContext context2 = new ClassPathXmlApplicationContext("contextToshiba.xml");
		Object object2 = context2.getBean("t1000");
		if(object2 instanceof ModelT1000){
			ModelT1000 t1000 = (ModelT1000) context2.getBean("t1000");
			t1000.action();
		}
	}
}
