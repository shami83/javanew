package com.example.openclose;

public class Rectangle implements shape{
	private int length;
	private int breadth;
	drawAPI api;
	Rectangle(int length,int breadth,drawAPI api)
	{
		this.length=length;
		this.breadth=breadth;
		this.api=api;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is " + length*breadth);
		
	}

	@Override
	public void drawShape() {
		
		String medium = api.draw();
		System.out.println("drawing recangle on " + medium);
		
	}

	

}
