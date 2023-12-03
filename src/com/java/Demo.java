package com.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,50,100);
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Number Is:" + max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Number Is:" + min);
	}
		
	}


