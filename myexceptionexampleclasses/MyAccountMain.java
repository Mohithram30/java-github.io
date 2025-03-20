package test.myexceptionexampleclasses;

public class MyAccountMain {

	public MyAccountMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAccount ac=new MyAccount(30000.0f);
		
		System.out.println("My initial Balance:"+ac.balance);
		
		try
		{
		ac.withDraw(10000);
		}
	    
	    catch(CustomException e)
		{
				//System.err.println("Withdrawal 10000 is greater than withDrawLimit:"+ac.withDrawLimit);
			System.err.println(e);
		}
		
		
		
		
		System.out.println("My Balance is :"+ac.balance);

	}

}
