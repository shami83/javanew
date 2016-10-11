package com.example.codesmell.parallelinheritence;

public class Manager {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
	/*	Engineer comp = new ComputerEngineer();
		comp.setType("Computer Engineer");
		comp.setSalary(50000);
		comp.setMileStone(new ComputerMileStone());
		
		Engineer civil = new CivilEngineer();
		civil.setType("Civil Engineer");
		civil.setSalary(60000);

		civil.setMileStone(new CivilMileStone());*/
		
		
	/*	Engineer comp = EngineerFactory.getEngineer(PartialComputerEngineer.class);
		comp.setType("Computer Engineer");
		comp.setSalary(50000);
		
		Engineer civil = EngineerFactory.getEngineer(PartialCivilEngineer.class);
		civil.setType("Computer Engineer");
		civil.setSalary(50000);*/
		
		EngineerMileStone comp = new RefactorComputerEngineer();
		comp.setType("Computer Engineer");
		comp.setSalary(50000);
		
		
		EngineerMileStone civil = new ReFactorCivilEngineer();
		civil.setType("Civil Engineer");
		civil.setSalary(60000);
		
		System.out.println(comp);
		System.out.println("********************");
		System.out.println(civil);
		}
}
