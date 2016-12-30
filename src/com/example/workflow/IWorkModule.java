package com.example.workflow;

public interface IWorkModule {
	
	public void process() throws Exception;
	public void transform() throws Exception;
	public void setSalience(Integer val);
	public Integer getSalience();
	public void addWorkFlowContext(WorkFlowContext ctx);
	public void addDestinationContext(IContext ctx);
	

}
