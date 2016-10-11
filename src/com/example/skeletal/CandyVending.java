package com.example.skeletal;

public class CandyVending  implements Ivending{  //extends AbstractVending

	
	private class AbstractVendingDelegator extends AbstractVending
	{

		@Override
		public void chooseProduct() {
			System.out.println("Produce diiferent candies");
			System.out.println("Choose a type of candy");
			System.out.println("pay for candy");
			System.out.println("collect candy");
			
		}
		
	}
	
	AbstractVendingDelegator delegator = new AbstractVendingDelegator();
	
	@Override
	public void start() {
		//System.out.println("Start Vending machine");
		delegator.start();
		
	}
	
	

	@Override
	public void chooseProduct() {
		/*System.out.println("Produce diiferent candies");
		System.out.println("Choose a type of candy");
		System.out.println("pay for candy");
		System.out.println("collect candy");*/
		
		delegator.chooseProduct();
	}

	

	@Override
	public void stop() {
		//System.out.println("Stop Vending machine");
		delegator.stop();
		
	}

	@Override
	public void process() {
		//start();
		//chooseProduct();
		//stop();
		delegator.process();
		
	}
	
	



	
}
