package test.myprimeornotexamples;

public class MyPrimeOrNotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		
		int counter=2;
		
		boolean isPrime=true;
		
		while(counter<num)
		{
			if((num%counter)==0)
			{
				isPrime=false;
				break;
			}
			counter++;
			
		}
		
		if(isPrime)
		{
			System.out.println(num+":The number is a prime number");
		}
		else
		{
			System.out.println(num+":The number is not a prime number");
		}

	}

}
