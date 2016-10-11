package com.example.string;

public class StringLiteral {
	
	public static void main(String[] args) {
		
		String s="hell";
		String o = "o";
		String res = s+o;
		
		System.out.println("s" + s.hashCode());
		System.out.println("s-literal" + s.intern().hashCode());
		System.out.println("hello".hashCode());
		System.out.println(res.hashCode());
		
		if("hello" == res)
		{
			System.out.println("true");
		}
		
				
		System.out.println("false");
	}

}
