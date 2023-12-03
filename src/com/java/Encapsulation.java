package com.java;

public class Encapsulation {

	public void studentName() {
		System.out.println("Sara");
	}

	public void studentNumber() {
		System.out.println(15);
	}

	public void studentMailId() {
		System.out.println("sara@gmail.com");

	}
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.studentName();
		e.studentNumber();
		e.studentMailId();
	}
}
