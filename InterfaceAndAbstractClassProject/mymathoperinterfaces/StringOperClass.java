package test.mymathoperinterfaces;

public class StringOperClass implements MaothOper1{

	public StringOperClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	String str1,str2;
	
	public StringOperClass(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
	}
	
	public void add()
	{
		System.out.println("String concatenation result is:"+str1+" "+str2);
	}
	
	public void sub()
	{
		System.out.println("Lexicographically calculated result is :"+str1.compareTo(str2));
	}

}
