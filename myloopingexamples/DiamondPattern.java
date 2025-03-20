package test.myloopingexamples;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2;
		int k=2;
		
		for(int i=1;i<=num;i++)
		{
			
			for(int m=1;m<=num-i;m++)
			{
				
				System.out.print("\t");
			}
			
			for(int n=1;n<=(2*i)-1;n++)
			{
			 System.out.print(k+"\t");
			 k+=2;
			}
			
			System.out.print("\n");
			
		}
		
		for(int j=num-1;j>=1;j--)
		{
			for(int m=1;m<=num-j;m++)
			{
				
				System.out.print("\t");
			}
			
			for(int n=1;n<=(2*j)-1;n++)
			{
			 System.out.print(k+"\t");
			 k+=2;
			}
			
			System.out.print("\n");
				
			
		}

	}

}
