package org.springframework.samples;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	@Pointcut("execution(* org.springframework.samples.Student.*(..))")
	private void allFromStudent() {
	}

//	@Pointcut("within(com.tutorialspoint.Profile..*)")
	@Pointcut("execution(* org.springframework.samples.Profile.*(..))")
	private void allFromProfile() {
	}

	@Pointcut("execution(* org.springframework.samples.*.set*(..))")
	private void allSetters() {
	}
	
	@Pointcut("execution(* org.springframework.samples.Student.set*(..))")
	private void studentSetters() {
	}
	
	@Pointcut("execution(* org.springframework.samples.Student.get*(..))")
	private void studentGetters() {
	}

	@Pointcut("execution(* org.springframework.samples.*.get*(..))")
	private void allGetters() {
	}

	@Before("allFromStudent()")
	public void beforeStudent() {
		System.out.println("Going to call some from _Student_");
	}
	
	@Before("allFromProfile()")
	public void beforeProfile() {
		System.out.println("Going to call some from _Profile_");
	}
	
	@Before("allSetters()")
	public void beforeSetters() {
		System.out.println("Going to call some setter()");
	}
	
	@Before("studentSetters()")
	public void beforeStudentSetters() {
		System.out.println("Going to call Student's setter()");
	}
	
	@Around("studentSetters()")
	public Object aroundStudentSetters(ProceedingJoinPoint pjp) throws Throwable {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Are you shure you want to change default data by calling \"" +pjp+ "\" (Y/n): ");
		String answer = scan.next();
		Object retval = null;
		if(answer.trim().equalsIgnoreCase("Y")){
			System.out.println("OK-OK, i'm doing so");
			retval = pjp.proceed();
		}else{
			System.out.println("You've made right choise");
		}
		return retval;
	}
	
	@Before("studentGetters()")
	public void beforeStudentGetters() {
		System.out.println("Going to call Student's getter()");
	}
	
	@Before("allGetters()")
	public void beforeGetters() {
		System.out.println("Going to call some getter()");
	}
}
