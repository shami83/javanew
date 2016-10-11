package com.example.skeletal;

public class VendingManager {
	
	public static void main(String[] args) {
		Ivending candy = new CandyVending();
		Ivending drink = new DrinkVending();
		//AbstractVending candy =  new CandyVending();
		//AbstractVending drink =  new DrinkVending();
		candy.process();
		System.out.println("*********************");
		drink.process();
		
		if(drink instanceof VendingService)
		{
			VendingService vs = (VendingService)drink;
			vs.service();
		}
		
	}

}
