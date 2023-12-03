package com.java;

public class Scanner {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Person Details:");
		String string = sc.next().toString();
		System.out.println(string);
		
		System.out.println("Enter The First Name:");
		String next = sc.next();
		System.out.println(next);
		
		System.out.println("Enter The Last Name:");
		String next2 = sc.next();
		System.out.println(next2);
		
		System.out.println("Enter The Number:");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		System.out.println("Enter The Salary:");
		float nextFloat = sc.nextFloat();
		System.out.println(nextFloat);
		
		System.out.println("Enter The Section:");
		char charAt = sc.next().charAt(0);
		System.out.println(charAt);
		
		System.out.println("Enter The Date:");
		byte nextByte = sc.nextByte();
		System.out.println(nextByte);
		
		System.out.println("Enter The Month:");
		short nextShort = sc.nextShort();
		System.out.println(nextShort);
		
		System.out.println("Enter The Phone Number:");
		long nextLong = sc.nextLong();
		System.out.println(nextLong);
		
		System.out.println("Enter The Time:");
		double nextDouble = sc.nextDouble();
		System.out.println(nextDouble);
		
		System.out.println("Enter The True Or False:");
		boolean nextBoolean = sc.nextBoolean();
		System.out.println(nextBoolean);
		
		
	}

}
