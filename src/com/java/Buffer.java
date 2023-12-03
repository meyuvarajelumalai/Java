package com.java;

public class Buffer {
	public static void main(String[] args) throws InterruptedException{
		StringBuffer s = new StringBuffer("Yuvaraj");
		System.out.println(System.identityHashCode(s));
		Thread.sleep(3000);
		StringBuffer s1 = new StringBuffer("Yuvaraj");
		System.out.println(System.identityHashCode(s1));
		Thread.sleep(5000);
		System.out.println(System.identityHashCode(s1.append(s)));
	}

}
