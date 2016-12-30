package com.example.workflow;

public interface IContext {
	
	public void addEntry(String key,Object value);
	public Object getEntry(String key);

}
