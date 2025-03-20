package test.myexceptionexampleclasses;

public class Division {

	
	int a,b;
	public Division(int a,int b) {
		// TODO Auto-generated constructor stub
		
		this.a=a;
		this.b=b;
	}
	
	public void divide()
	{
		try
		{
		System.out.println("Connection opened");
		int[] arr=new int[5];
		
		Object obj=10;
		
	
		
		arr[3]=20;
			
		String num="10";
		
		int myNum=Integer.parseInt(num);
		String str2="Raju";
		String str=new String(str2);
		
		System.out.println("The part of string is :"+str.substring(0,4));
		System.out.println("The divident is :"+(a/b));
		
		
		}
		
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.err.println("Sorry, Index not valid");
			aiob.printStackTrace();
		}
		
		catch(NumberFormatException nfe)
		{
			System.err.println("The string num does not have number");
			nfe.printStackTrace();
		}
		catch(NullPointerException npe)
		{
			System.err.println("Sorry,Str is null. Cannot create object with null");
		}
		catch(ArithmeticException ae)
		{
			System.err.println("Sorry, b is zero. Cannot divide by zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Connection closed");
		}
		
		
	}

}
