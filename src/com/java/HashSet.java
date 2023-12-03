package com.java;

import java.util.Set;

public class HashSet {
	
	public static void main(String[] args) {
		Set<Object > o = new java.util.HashSet<>();
		o.add(14.5);
		o.add("Yuvi");
		o.add('A');
		o.add(null);
		o.add('A');
		System.out.println(o);
		int size = o.size();
		System.out.println(size);
		boolean contains = o.contains("Yuvi");
		System.out.println(contains);
//		o.clear();
//		System.out.println(o);
		Set<Object > on = new java.util.HashSet<>();
		on.add(16.5);
		on.add("Raja");
		on.add('B');
		on.add(null);
		on.add('B');
		System.out.println(on);
		o.addAll(on);
		System.out.println(o);
		o.retainAll(on);
		System.out.println(o);
		o.removeAll(on);
		System.out.println(o);
		
		
	}

}
