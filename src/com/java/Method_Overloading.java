package com.java;

public class Method_Overloading {
	
	public void studentDetails(String name) {
		System.out.println("Student Name :" + name );

	}
	public void studentDetails(String dep,char sec, long number ) {
		System.out.println("Student Department :" + dep );
		System.out.println("Student Section :" + sec );
		System.out.println("Student Number :" + number );
	}
	public void studentDetails(int m1, int m2, int m3) {
		System.out.println("Student Mark :" + m1+","+m2+","+m3);
	}
	
	public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.studentDetails("Mano");
		m.studentDetails("Mechanical", 'B', 9962330044L);
		m.studentDetails(90, 92, 94);
	}

}
