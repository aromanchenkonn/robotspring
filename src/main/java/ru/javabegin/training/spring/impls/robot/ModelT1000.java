package ru.javabegin.training.spring.impls.robot;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;

	/*
	*
	* без этого конструктора bean, описаный в файле context.xml создан не будет, а будет ошибка
	* java.lang.NoSuchMethodException: ru.javabegin.training.spring.impls.robot.ModelT1000.<init>()
	at java.lang.Class.getConstructor0(Class.java:3082)
	* */
	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public void fire() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
