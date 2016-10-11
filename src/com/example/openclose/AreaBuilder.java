package com.example.openclose;

public class AreaBuilder {
	
	private void calculateRectangleArea(int length,int breadth)
	{
		System.out.println("Area of Rectangle is " + length*breadth);
	}
	
	
	private void calculateSquareArea(int length)
	{
		System.out.println("Area of Square is " + length*length);
	}
	
	public void getArea(String type,int length,int breadth)
	{
		if("square".equalsIgnoreCase(type))
		{
			calculateSquareArea(length);
		}
		else if("rectangle".equalsIgnoreCase(type))
		{
			calculateRectangleArea(length,breadth);
		}
	}
	public void getArea(String type,int length)
	{
		getArea(type,length,length);
	}

	
	
	
	public static void main(String[] args) {
		
		AreaBuilder builder = new AreaBuilder();
		//builder.calculateRectangleArea(20, 10);
		builder.getArea("square", 10);
		builder.getArea("rectangle", 10,5);
		
		
	}

}
