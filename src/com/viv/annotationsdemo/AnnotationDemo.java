package com.viv.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		// read spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
