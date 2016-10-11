package com.example.openclose;

public class Square implements shape{

	private int edge;
	drawAPI api;
	public Square(int edge,drawAPI api)
	{
		this.edge=edge;
		this.api=api;
	}
	@Override
	public void area() {
		System.out.println("Area of Square is " + edge*edge);
		
	}
	@Override
	public void drawShape() {
		String medium=api.draw();
		System.out.println("drawing square on "+medium );
		
	}

}
