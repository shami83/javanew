package com.example.workflow;

public class DataBaseModule implements IWorkModule{

	private WorkFlowContext ctx;
	private IContext destinationContext;
	private int salience=0;//default salience
	
	@Override
	public void process() throws Exception {
	System.out.println("This is a Database Module ");
	System.out.println("Prirority of Database Module is" + salience);
	System.out.println("persists require data");
	System.out.println("can add result it Workflow Context so it can be used in Transformation");
		
	}

	@Override
	public void transform() throws Exception {
		System.out.println("Start transformation for destination context  "+destinationContext);
 		System.out.println("get result from Workflow context and then transform it accordingly");
 		System.out.println("if want to plug any third party transformer write a TransformerFactory and pass the required parameter in destinationContext Object");
		
		
	}

	@Override
	public void setSalience(Integer val) {
		this.salience=val;
		
	}

	@Override
	public Integer getSalience() {
	return salience;
	}

	@Override
	public void addWorkFlowContext(WorkFlowContext ctx) {
		this.ctx=ctx;
		
	}

	
	@Override
	public void addDestinationContext(IContext ctx) {
		this.destinationContext=ctx;
	}

}
