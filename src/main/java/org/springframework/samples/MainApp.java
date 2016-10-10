package org.springframework.samples;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){

		Profile profile = (Profile) context.getBean("profile");

		profile.printAge();
		profile.printName();
		StudCollection studCollection = (StudCollection) context.getBean("studCollection");
		System.out.print(studCollection);
		List<Student> studList = studCollection.getProfileList();
		studList.get(0).setAge(256);
		System.out.print(studCollection);
		}		
	}
}
