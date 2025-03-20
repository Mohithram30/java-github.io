package test.mypolymorphismexamples;

public class Addition {
int a,b;

String str1,str2;

public Addition(int a,int b)
{
	this.a=a;
	this.b=b;
}

public Addition(String str1,String str2)
{
	this.str1=str1;
	this.str2=str2;
	
	
}

public void add()
{
	if((str1==null)&&(str2==null))
	{
	System.out.println("The Number heap sum is :"+(a+b));
	}
	else
	{
	System.out.println("The alphabetic concatenation is :"+(str1+" "+str2));
	}
}

public void add(int a,int b)
{
	System.out.println("The stack sum is :"+(a+b));
}
	
	
	
	
	
}
