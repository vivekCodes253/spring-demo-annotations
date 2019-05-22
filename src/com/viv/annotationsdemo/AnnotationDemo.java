package com.viv.annotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		// read spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach theCoachReturns = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("Address 1 = " +theCoach+"\tAddress 2 = "+theCoachReturns);
		//System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach.getDailyFortune());
		
		context.close();
 
	}

}
