package com.java;

public class Builder {
	public static void main(String[] args) {
		
	StringBuilder s = new StringBuilder("Vel");
	System.out.println(System.identityHashCode(s));
	StringBuilder s1 = new StringBuilder("Vel");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s1.append(s)));
	}
}
