package com.example.workflow;

public class WorkFlowManager {
	private WorkFlow flow = new WorkFlow();
	public void addWorkFlowFromUIOrCmdLine(IWorkModule module)
	{
		flow.addModule(module);
	}
	
	public void flow() throws Exception
	{
		flow.start();
	}
	
	public static void main(String[] args) throws Exception {
		
		IWorkModule fileModule = new FileModule();
		WorkFlowContext ctx = new WorkFlowContext();
		ctx.addEntry("test", "Demo");
		fileModule.addWorkFlowContext(ctx);
		fileModule.addDestinationContext(ctx);
		fileModule.setSalience(5);
		
		IWorkModule jmsModule = new JMSModule();
		jmsModule.addWorkFlowContext(ctx);
		jmsModule.addDestinationContext(ctx);
		jmsModule.setSalience(4);
		
		IWorkModule databaseModule = new DataBaseModule();
		databaseModule.addWorkFlowContext(ctx);
		databaseModule.addDestinationContext(ctx);
		databaseModule.setSalience(3);
		
		WorkFlowManager mgr = new WorkFlowManager();
		mgr.addWorkFlowFromUIOrCmdLine(fileModule);		
		mgr.addWorkFlowFromUIOrCmdLine(databaseModule);
		mgr.addWorkFlowFromUIOrCmdLine(jmsModule);
		mgr.flow();
		
		System.out.println("**********Changing the Flow by reset prirority***********");
		fileModule.setSalience(1);
		jmsModule.setSalience(4);
		databaseModule.setSalience(7);
		mgr.flow();
	}

}
