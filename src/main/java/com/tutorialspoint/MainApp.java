package com.tutorialspoint;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml")){

		Profile profile = (Profile) context.getBean("profile");

		profile.printAge();
		profile.printName();
		}		
	}
}
