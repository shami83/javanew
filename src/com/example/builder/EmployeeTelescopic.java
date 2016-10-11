package com.example.builder;

public class EmployeeTelescopic {
	
	private String name;
	private Integer empId;
	private String company;
	private Integer passport;
	private String tempAddress ;
	
	
	public EmployeeTelescopic(String name,Integer empId,String company)
	{
		this(name,empId,company,0);
	}
	
	public EmployeeTelescopic(String name,Integer empId,String company,int passport)
	{
		this(name,empId,company,passport,"NA");
	}
	
	public EmployeeTelescopic(String name,Integer empId,String company,Integer passport,String tempAddress)
	{
		this.name=name;
		this.empId=empId;
		this.company=company;
		this.passport=passport;
		this.tempAddress=tempAddress;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "EmployeeTelescopic [name=" + name + ", empId=" + empId
				+ ", company=" + company + ", passport=" + passport
				+ ", tempAddress=" + tempAddress + "]";
	}

	public static void main(String[] args) {
		
		EmployeeTelescopic emp = new EmployeeTelescopic("Shamik",100,"IBM");
		EmployeeTelescopic emp1 = new EmployeeTelescopic("Akash",101,"IBM",1234,"1,bangalore");
		System.out.println(emp);
		System.out.println(emp1);
	}

}
