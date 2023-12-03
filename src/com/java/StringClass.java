package com.java;

public class StringClass {
public static void main(String[] args) {
	
	String s = "Hello Java";
	String s1 =  "HellO Java";
	
	int length = s.length();
	System.out.println(length);
	boolean equals = s.equals(s1);
	System.out.println(equals);
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	boolean startsWith = s.startsWith("Hello");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("e");
	System.out.println(endsWith);
	boolean contains = s.contains("e");
	System.out.println(contains);
	int indexOf = s.indexOf("o");
	System.out.println(indexOf);
	int lastIndexOf = s.lastIndexOf("a");
	System.out.println(lastIndexOf);
	char charAt = s.charAt(8);
	System.out.println(charAt);
	String replace = s.replace("Hello", "Hai");
	System.out.println(replace);
	String substring = s.substring(6);
	System.out.println(substring);
	boolean empty = s.isEmpty();
	System.out.println(empty);
	String[] split = s.split(" ");
	for (String string : split) {
		System.out.println(string);	
	}
	String str = "     Hello Java     ";
	System.out.println(str);
	System.out.println(str.trim());
	String substring2 = s.substring(2, 5);
	System.out.println(substring2);
	
}
}
