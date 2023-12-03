package com.java;

public class Condition_Statement {
	public static void main(String[] args) {
		int i = 90;
		if (i<=55) {
			System.out.println("Condition Pass");
		}
		else if (i>=60 && i<=70) {
			System.out.println("D Grade");
			
		}
		else if (i>=71 && i<=80) {
			System.out.println("C Grade");
			
		}
		else if (i>=81 && i<=90) {
			System.out.println("B Grade");
			
		}
		else if (i>=91 && i<=100) {
			System.out.println("A Grade");
		}
		else {
			System.out.println("InValid Number");
		}
	}

}
