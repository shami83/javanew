package com.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {
	
	public static void main(String[] args) {
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setName("Shamik Mitra");
		emp.setDept("Distribution");
		emp.setAge(33);
		emp.setSalary(20000);
		
		Employee emp1 = new Employee();
		emp1.setName("Samir Mitra");
		emp1.setDept("Media");
		emp1.setAge(67);
		emp1.setSalary(50000);
		
		Employee emp2 = new Employee();
		emp2.setName("Swatika Mitra");
		emp2.setDept("R&D");
		emp2.setAge(32);
		emp2.setSalary(30000);
		
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		
		Comparator ageComparator = new Comparator<Employee>()
		{

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge()-o2.getAge();
			}
			
		};
		
		Comparator nameComparator = new Comparator<Employee>()
				{

					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getName().compareTo(o2.getName());
					}
					
				};
		
		Collections.sort(list,ageComparator);
		System.out.println(list);
		Collections.sort(list,nameComparator);
		System.out.println(list);
	}

}
