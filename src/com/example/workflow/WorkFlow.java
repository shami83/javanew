package com.example.workflow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkFlow {
	
	private List<IWorkModule> moduleList = new ArrayList<IWorkModule>();
	
	
	public WorkFlow addModule(IWorkModule module)
	{
		moduleList.add(module);
		return this;
		
	}
	
	
	public void start() throws Exception
	{
		Collections.sort(moduleList, new Comparator<IWorkModule>(){
			  @Override
				public int compare(IWorkModule i1, IWorkModule i2) {
					return i2.getSalience().compareTo(i1.getSalience());
				}
	
			});
		
		
		for(IWorkModule module: moduleList){
			
			module.process();
			System.out.println("=====================");
			module.transform();
			
			System.out.println("=====================END OF FLOW==========");
			
		}
			
			
		
		
		
	}
	
	


}
