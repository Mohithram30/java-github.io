package test.mymathoperinterfaces;

public abstract  class AbstractClassExampleParent {
	
	
	
	//Connection con;Statement st=con.createStatement()
	
	String str1,str2;
	
	public AbstractClassExampleParent(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	
	
	public abstract void sub();
	
	public void add()
	{
		System.out.println("Abstract class output is :"+str1+" "+str2);
	}

}
