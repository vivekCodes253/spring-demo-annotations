package com.viv.annotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class sadfortune implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is ok";
	}

}
