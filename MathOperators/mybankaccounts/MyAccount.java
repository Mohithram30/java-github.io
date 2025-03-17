package test.mybankaccounts;

public class MyAccount {
	
	
	
	int principal;
	
	float balance;
	
	float accrual;
	
	public int depositAmount(int deposit)
	{
		principal+=deposit;
		balance+=deposit;
		return principal;
	}
	
	public float calcAccrual(float interestRate,int noOfDays)
	{
		accrual=(principal*noOfDays*interestRate)/(365*100);
		return accrual;
		
		
	}
	
	public float updateFinalBalance()
	{
		balance+=accrual;
		return balance;
		
		
	}

}
