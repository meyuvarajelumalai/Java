package com.java;

public class Exception_Handling {
public static void main(String[] args) {
try {
	int i = 10;
	System.out.println(i/0);
} catch (ArithmeticException e) {
	
	System.out.println(e.getMessage());

}
}
}