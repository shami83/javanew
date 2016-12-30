package com.example.staticTest;

public class Student {
	
	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}
	
	
	public static void main(String[] args) {
		
		Student.setName("Shamik");
		System.out.println(Student.getName());
		
	}
	
	
	

}
