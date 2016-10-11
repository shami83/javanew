package com.example.date;
import java.util.Date ;
public class DateTest {
	
	
	public void dateTest()
	{
		Date today = new Date();
		System.out.println(today);
		Date todayAgain = new Date();
		System.out.println(todayAgain);
		System.out.println(today.compareTo(todayAgain) == 0);
	}
	
	public static void main(String[] args) {
		
		DateTest test = new DateTest();
		test.dateTest();
		
	}

}
