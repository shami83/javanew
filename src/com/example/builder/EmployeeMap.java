package com.example.builder;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
	
	private String name;
	private Integer empId;
	private String company;
	private Integer passport;
	private String tempAddress ;
	
	
	EmployeeMap(Map<String,Object> map) throws IllegalArgumentException
	{
		if(!(map.containsKey("name") && map.containsKey("empId") && map.containsKey("company")))
		{
			throw new IllegalArgumentException("Required  Parameter missing");
		}
		if((map.get("name")==null || map.get("empId")==null ||  map.get("company")==null))
		{
			throw new IllegalArgumentException("Required  Parameter missing");
		}
		
		if(map.get("name") instanceof String)
		{
			this.name =(String) map.get("name") ;
		}
		else{
			throw new IllegalArgumentException("name Parameter  type is wrong"); 
		}
		
		if(map.get("empId") instanceof Integer)
		{
			this.empId =(Integer) map.get("empId") ;
		}
		else{
			throw new IllegalArgumentException("enpId Parameter  type is wrong"); 
		}
		if(map.get("company") instanceof String)
		{
			this.company =(String) map.get("company") ;
		}
		else{
			throw new IllegalArgumentException("company Parameter  type is wrong"); 
		}
		
		
		if(map.containsKey("passport") && (map.get("passport") instanceof Integer))
		{
			this.passport = (Integer)map.get("passport");
		}
		else
		{
			this.passport=0;
		}
		
		if(map.containsKey("tempAddress") && (map.get("tempAddress") instanceof String))
		{
			this.tempAddress = (String)map.get("tempAddress");
		}
		else
		{
			this.tempAddress="NA";
		}
	}
	
	
	
	@Override
	public String toString() {
		return "EmployeeMap [name=" + name + ", empId=" + empId + ", company="
				+ company + ", passport=" + passport + ", tempAddress="
				+ tempAddress + "]";
	}



	public static void main(String[] args) {
		
		try
		{
		Map map = new HashMap<String,Object>();
		map.put("name", "Shamik");
		map.put("empId", 100);
		map.put("company", "IBM");
		EmployeeMap emp = new EmployeeMap(map);
		
		Map map1 = new HashMap<String,Object>();
		map1.put("name", "Akash");
		map1.put("empId", 101);
		map1.put("company", "IBM");
		map1.put("passport", "1234");
		map1.put("tempAddress", "1,bangalore");
		EmployeeMap emp1 = new EmployeeMap(map1);
		
		System.out.println(emp);
		System.out.println(emp1);
		
		}
		catch(IllegalArgumentException ex)
		{
			ex.printStackTrace();
		}
	}

}
