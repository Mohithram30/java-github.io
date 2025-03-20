package test.mymultidimensionalarrayexamples;

public class MultiDimensionClass {

	
	
	public MultiDimensionClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		0 [A,B,C]
		1 [D,E,F]
		2 [G.H,I]
		 [J,K,L]
		 */
		
		int[][] alphabets=new int[9][3];
		
		int k=0;
		
		for(int i=0;i<alphabets.length;i++)
		{
			System.out.print("[");
			for(int j=0;j<alphabets[i].length;j++)
			{
				if(k!=26)
				{
				char myChar=(char)(k+65);
				
				if(j==alphabets[i].length-1)
				{
				System.out.print(myChar);
				}
				else
				{
				System.out.print(myChar+",");
				}
				}
				else
				{
				System.out.print(new String(new byte[]{32}));	
				}
				k++;
			}
			System.out.print("]");
			System.out.print("\n");
			
		}

	}

}
