package test.myexceptionexampleclasses;

public class MyAccount {
	
	float balance;
	int withDrawLimit=5000;

	public MyAccount(float balance) {
		// TODO Auto-generated constructor stub
		
	 this.balance=balance;
		
	}
	
	public float withDraw(int withDrawAmount) throws CustomException
	{
		
		if(withDrawAmount>withDrawLimit)
		{
		throw new CustomException(withDrawAmount+"is greater than WithDrawLimit:"+withDrawLimit);
			//throw new ArithmeticException();
		
			
		}
		
		balance-=withDrawAmount;
		
		return balance;
	}

}
