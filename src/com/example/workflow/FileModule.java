package com.example.workflow;

public class FileModule implements IWorkModule{

	private WorkFlowContext ctx;
	private IContext destinationContext;
	private int salience=0;//default salience
	
	@Override
	public void process() throws Exception {
	System.out.println("This is a File Module ");
	System.out.println("Prirority of File Module is" + salience);
	System.out.println("This method is Entry point of module");
	System.out.println("can add result it Workflow Context so it can be used in Transformation");
		
	}

	@Override
	public void transform() throws Exception {
		System.out.println("Start transformation for destination context  "+destinationContext);
		System.out.println("get result from Workflow context and then transform it accordingly");
		
		
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
