package test.mymultidimensionalarrayexamples;

public class ThreeDimensionalArrayClass {

	public ThreeDimensionalArrayClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 [[A,B] [C,D] [E,F]]
		 [[G,H] [I,J] [K,L]]
		 */
		
		int[][][] tdArr=new int[5][3][2];
		
		int k=0;
		for(int i=0;i<tdArr.length;i++)
		{
			System.out.print("[");
			for(int j=0;j<tdArr[i].length;j++)
			{
				System.out.print("[");
				for(int m=0;m<tdArr[i][j].length;m++)
				{
					if(k<26)
					{
					char myChar=(char)(k+65);
					
					if(m!=tdArr[i][j].length-1)
					{
						System.out.print(myChar+",");
					}
					else
					{
						System.out.print(myChar);
					}
					}
					else
					{

						if(m!=tdArr[i][j].length-1)
						{
							System.out.print(new String(new byte[] {32})+",");
						}
						else
						{
							System.out.print(new String(new byte[] {32}));
						}
						
					}
					
					
					
					k++;
					
					
					
				}
				System.out.print("]");
				System.out.print(new String(new byte[] {32}));
				
			}
			System.out.print("]");
			System.out.print("\n");
		}

	}

}
