package com.viv.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

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

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Here too");
		this.fortuneService = fortuneService;
	}
	
	
	
	

}
