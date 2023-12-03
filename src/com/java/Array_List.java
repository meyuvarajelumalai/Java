package com.java;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
public static void main(String[] args) {
	List<String> l = new ArrayList<>();
	l.add("Sara");
	l.add("Vel");
	l.add("Mano");
	l.add("Mano");
	System.out.println(l);
	int size = l.size();
	System.out.println(size);
	String string = l.get(2);
	System.out.println(string);
	int indexOf = l.indexOf("Sara");
	System.out.println(indexOf);
	boolean contains = l.contains("Vel");
	System.out.println(contains);
//	l.remove(1);
//	System.out.println(l);
//	l.clear();
//	System.out.println(l);
	List<String> s = new ArrayList<>();
	s.add("A");
	s.add("B");
	s.add("C");
	s.add("D");
	System.out.println(s);
	s.addAll(l);
	System.out.println(s);
	s.retainAll(l);
	System.out.println(s);
	s.removeAll(l);
	System.out.println(s);
	
}
}
