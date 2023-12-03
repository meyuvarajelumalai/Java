package com.java;

public class ClassA implements Abstraction{
	
	@Override
	public void studentName() {
	System.out.println("Sara");
	}
	@Override
	public void studentNumber() {
	System.out.println("15");	
	}
	@Override
	public void studentMailId() {
		System.out.println("sara@gmail.com");
	}
	@Override
	public void studentDepartment() {
		System.out.println("BCA");
	}
	public static void main(String[] args) {
		ClassA m = new ClassA();
		m.studentName();
		m.studentNumber();
		m.studentMailId();
		m.studentDepartment();
	}

}
