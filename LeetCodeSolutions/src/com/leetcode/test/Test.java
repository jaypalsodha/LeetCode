package com.leetcode.test;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> empList = Test.empList();
		
		System.out.println(empList.stream()
				.sorted((e1, e2) -> e2.getAge() - e1.getAge())
				.collect(Collectors.toList()));
		
	}
	
	public static List<Employee> empList() {
		
		return List.of(new Employee(50),
				new Employee(40),
				new Employee(30),
				new Employee(20),
				new Employee(10));
	}
}

class Employee {

	private int id;
	private String name;
	private int age;

	public Employee(int age) {
		super();
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "age : "+age;
	}
}
