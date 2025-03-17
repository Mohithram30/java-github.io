package test.mybankaccounts;

public class MyAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAccount acc=new MyAccount();
		
		acc.depositAmount(10000);
		
		System.out.println("Balance is :"+acc.balance);
		
		acc.calcAccrual(2.5f, 31);
		
		System.out.println("The accrual is :"+acc.accrual);
		
		acc.updateFinalBalance();
		
		System.out.println("The final balance is: "+acc.balance);
		
		acc.depositAmount(5000);
		
		System.out.println("The final principal is :"+acc.principal);
		System.out.println("The final balance is :"+acc.balance);
	}

}
