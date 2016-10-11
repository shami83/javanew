package com.example.builder;

public class Employee {
	
	private String name;
	private Integer empId;
	private String company;
	private Integer passport;
	private String tempAddress ;
	
	private Employee()
	{
		
	}
	private static class EmployeeBuilder
	{
		private String name;
		private Integer empId;
		private String company;
		private Integer passport;
		private String tempAddress ;
		public EmployeeBuilder(String name,Integer empId,String company)
		{
			this.name=name;
			this.empId=empId;
			this.company=company;
		}
		
		public EmployeeBuilder setPassport(Integer passport)
		{
			this.passport=passport;
			return this;
			
		}
		
		public EmployeeBuilder setTempAddress(String address)
		{
			this.tempAddress=address;
			return this;
			
		}
		
		public Employee build()
		{
			Employee emp = new Employee();
			
			emp.name=this.name;
			emp.empId=this.empId;
			emp.company=this.company;
			emp.passport=this.passport!=null?this.passport:0;
			emp.tempAddress=this.tempAddress!=null?this.tempAddress:"NA";
			return emp;
		}

		
		
		
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", company="
				+ company + ", passport=" + passport + ", tempAddress="
				+ tempAddress + "]";
	}



	public static void main(String[] args) {
		
		Employee emp = new Employee.EmployeeBuilder("Shamik", 100, "IBM").build();
		Employee emp1 = new Employee.EmployeeBuilder("Akash", 101, "IBM").setPassport(1234).setTempAddress("1,bangalore").build();
		System.out.println(emp);
		System.out.println(emp1);
	}
	

}
