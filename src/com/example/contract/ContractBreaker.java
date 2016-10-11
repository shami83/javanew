package com.example.contract;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContractBreaker {
	
	public static void main(String[] args) {
		
		Glass plastic = new Glass(Glass.Size.BIG,"Plastic");
		Glass glass = new Glass(Glass.Size.BIG,"glass");
		
		Set<Glass> set = new HashSet<Glass>();
		set.add(plastic);
		set.add(glass);
		
		System.out.println("HashSet says " + set);
		
		Set<Glass> treeSet = new TreeSet<Glass>();
		treeSet.add(plastic);
		treeSet.add(glass);
		System.out.println("TreeSet says " + treeSet);
		
	}

}
