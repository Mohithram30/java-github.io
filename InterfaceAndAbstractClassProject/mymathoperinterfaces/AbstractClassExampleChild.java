package test.mymathoperinterfaces;

public class AbstractClassExampleChild extends AbstractClassExampleParent{


	public static float pi=3.14F;
	
	public AbstractClassExampleChild()
	{
		super("A","D");
	}
	
	
	public void sub()
	{
		System.out.println("Child subtraction result is :"+str1.compareTo(str2));
	}

}
