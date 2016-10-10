package org.springframework.samples;

public class Student {
	private Integer age;
	private String name;

	public void setAge(Integer age) {
		System.out.println("Inside Student's setter age");
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		System.out.println("Inside Student's setter name");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}
