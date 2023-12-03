package com.java;

public class Class_B extends ConstructorA {
	
	public Class_B() {
		System.out.println();
	}
	
	public Class_B(String name) {
		System.out.println(name);
	}
	public Class_B(int id) {
		System.out.println(id);
	}
	public Class_B(long number) {
		System.out.println(number);
	}
	public static void main(String[] args) {
		Class_B a = new Class_B();
		Class_B b = new Class_B("Vel");
		Class_B c = new Class_B(12);
		Class_B d = new Class_B(9966009988l);
	}	
		
	}


