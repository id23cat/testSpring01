package com.tutorialspoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){

		Profile profile = (Profile) context.getBean("profile");

		profile.printAge();
		profile.printName();
		}		
	}
}
