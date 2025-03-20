package test.mymathoperinterfaces;

public class MathOperClass implements MaothOper1{

	public MathOperClass() {
		// TODO Auto-generated constructor stub
	}
	
	int a,b;
	
	public MathOperClass(int c,int d)
	{
		a=c;
		b=d;
	}
	
	public void add()
	{
		System.out.println("Addition result is :"+(a+b));
	}
	public void sub()
	{
		System.out.println("Subraction result is :"+(a-b));
	}
}
