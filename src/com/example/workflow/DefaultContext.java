package com.example.workflow;

import java.util.HashMap;
import java.util.Map;

public class DefaultContext implements IContext{
	
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

	@Override
	public String toString() {
		return "DefaultContext [configMap=" + configMap + "]";
	}
	
	

}
