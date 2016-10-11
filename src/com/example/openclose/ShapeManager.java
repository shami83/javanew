package com.example.openclose;

public class ShapeManager {
	
	private static ShapeManager manager = new ShapeManager();
	
	shape shape;
	
	private ShapeManager()
	{
		
	}
	
	public static ShapeManager getInstance()
	{
		return manager;
	}
	
	
	public void getArea() throws IllegalArgumentException 
	{
		if(shape ==null)
		{
			throw new IllegalArgumentException("please provide a Shape");
		}
		shape.area();
	}
	
	public void draw() throws IllegalArgumentException 
	{
		if(shape ==null)
		{
			throw new IllegalArgumentException("please provide a Shape");
		}
		shape.drawShape();
	}
	
	
	public shape getShape() {
		return shape;
	}



	public void setShape(shape shape) {
		this.shape = shape;
	}



	public static void main(String[] args) {
		
		shape rect = new Rectangle(10,20,new ComputerDraw());
		shape square = new Square(10,new PaperDraw());
		
		ShapeManager instance = ShapeManager.getInstance();
		instance.setShape(rect);
		instance.getArea();
		instance.draw();
		
		instance.setShape(square);
		instance.getArea();
		instance.draw();
		
		
	}

}
