package com.example.workflow;

import java.util.HashMap;
import java.util.Map;

public class WorkFlowContext implements IContext{
	
	private Map configMap = new HashMap();

	@Override
	public void addEntry(String key, Object value) {
		configMap.put(key, value);
		
	}

	@Override
	public Object getEntry(String key) {
		// TODO Auto-generated method stub
		return configMap.get(key);
	}


}
