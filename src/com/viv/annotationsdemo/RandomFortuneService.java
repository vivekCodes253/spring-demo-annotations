package com.viv.annotationsdemo;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {"fortune1","fortune2","fortune3"};
	private Random myRandom = new Random();
	//create an array of strings
	@Override
	public String getFortune() {
		//pick a random fortune and return
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
