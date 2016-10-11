package com.example.builder;

public class EmployeeNull {
	
	private String name;
	private Integer empId;
	private String company;
	private Integer passport;
	private String tempAddress;
	
	
	public EmployeeNull(String name,Integer empId,String company,Integer passport,String tempAddress) throws IllegalArgumentException
	{
		if(name ==null && empId==null && company==null)
		{
			throw new IllegalArgumentException("Required  Parameter missing");
		}
		
		this.name=name;
		this.empId=empId;
		this.company=company;
		this.passport= passport != null?passport:0;
		this.tempAddress = tempAddress !=null? tempAddress:"NA";
	}


	@Override
	public String toString() {
		return "EmployeeNull [name=" + name + ", empId=" + empId + ", company="
				+ company + ", passport=" + passport + ", tempAddress="
				+ tempAddress + "]";
	}
	
	
	public static void main(String[] args) throws IllegalAccessException {
		
		EmployeeNull emp = new EmployeeNull("Shamik",100,"IBM",null,null);
		EmployeeNull emp1 = new EmployeeNull("Akash",101,"IBM",1234,"1,blore");
		System.out.println(emp);
		System.out.println(emp1);
		
	}
	
	
}
