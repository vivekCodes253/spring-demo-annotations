package com.viv.annotationsdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	public TennisCoach(){
		System.out.println("Inside default");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Here too");
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	public void maker(){
		System.out.println("Welcome to postconstruct");
	}
	
	@PreDestroy
	public void destroyer() {
		System.out.println("Welcome to predestroy");
	}
	
	
	
	

}
