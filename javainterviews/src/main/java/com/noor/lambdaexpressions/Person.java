package com.noor.lambdaexpressions;

public class Person {

	private int age;
	private String firstName;
	private String lastName;

	public Person(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		this.firstName = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
