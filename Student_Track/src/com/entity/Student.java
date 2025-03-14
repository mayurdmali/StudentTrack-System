package com.entity;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private int age;
	public Student() {
		super();
	}
	public Student(int roll, String name, int marks, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
	

}
