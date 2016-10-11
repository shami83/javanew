package com.example.fluentapi.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.fluentapi.contract.IItem;
import com.example.fluentapi.contract.IMenu;

public class ArsalanMenuHandler implements IMenu{

	List<IItem> menuList = new ArrayList<IItem>();
	List<IItem> selectedList = new ArrayList<IItem>();
	
	public ArsalanMenuHandler()
	{
		IItem biriyani = new IItem(){
			public IItem name()
			{
				System.out.println("Mutton Biriyani");
				return this;
			}
			public Integer cost()
			{
				return 180;
			}
		};
		IItem muttonChap = new IItem(){
			public IItem name()
			{
				System.out.println("Mutton Chap");
				return this;
			}
			public Integer cost()
			{
				return 160;
			}
		};
		IItem firni = new IItem(){
			public IItem name()
			{
				System.out.println("Firni");
				return this;
			}
			public Integer cost()
			{
				return 100;
			}
			
			
		};
		menuList.add(biriyani);
		menuList.add(muttonChap);
		menuList.add(firni);
		
	}
	public IMenu order(int index) {
		// TODO Auto-generated method stub
		IItem item =get(index);
		selectedList.add(item);
		System.out.println("Order given ::");
		item.name();
		return this;
	}

	
	public IMenu eat() {
		for(IItem item : selectedList)
		{
			System.out.println("eating ");
			item.name();
		}
		return this;
	}

	
	public IMenu pay() {
		int cost=0;
		for(IItem item : selectedList)
		{
			cost = cost + item.cost();
		}
		System.out.println("Paying Ruppes" + cost);
		return this;
	}
	@Override
	public IItem get(int index) {
		// TODO Auto-generated method stub
		if(index <3)
		{
			return menuList.get(index);
		}
		return null;
		
	}
	
	public void showMenu(){
		System.out.println("MENU IN ARSALAN");
		for(IItem item : menuList)
		{
			
			item.name();
			
		}
		
	}

}
