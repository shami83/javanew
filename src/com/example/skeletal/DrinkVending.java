package com.example.skeletal;



public class DrinkVending extends VendingService  implements Ivending {//extends AbstractVending{

	private class AbstractVendingDelegator extends AbstractVending
	{

		@Override
		public void chooseProduct() {
			System.out.println("Produce diiferent soft drinks");
			System.out.println("Choose a type of soft drinks");
			System.out.println("pay for drinks");
			System.out.println("collect drinks");
			
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
		/*System.out.println("Produce diiferent soft drinks");
		System.out.println("Choose a type of soft drinks");
		System.out.println("pay for drinks");
		System.out.println("collect drinks");*/
		delegator.chooseProduct();
		
	}

	@Override
	public void stop() {
		//System.out.println("stop Vending machine");
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
