package test.myloopingexamples;

public class LoopingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*int counter=1;
	
	while(counter<=10)
	{
		System.out.println("Deposit challan for counter:"+counter);
		System.out.println("Update Passbook for counter:"+counter);
		counter++;
	}*/
	
	String[] train_no= {"A000","A001","A002","A003","A004","A005"};
	
	String[] train_name= {"Chennai Express","Delhi Express","Rajdhani Express","Mumbai Express","Kolkatta express","Jammu and kashmir express"};
	String[] arrival= {"0400hrs","0600hrs","0700hrs","0800hrs","0900hrs","1000hrs"};
	String[] departure= {"2100hrs","2200hrs","2300hrs","0000hrs","0100hrs","0200hrs"};
	
	
	
	
	int max=0;
	int counter=0;
	
	while(counter<train_name.length)
	{
		if(train_name[counter].length()>max)
		{
			max=train_name[counter].length();
		}
		counter++;
	}
	
	int total_len="TRAIN_NO".length()+max+"ARRIVAL".length()+"DEPARTURE".length()+25;
	
	int i=0;
	
	int num_of_trains=train_no.length;
	
    do
	{
		String str_dash="";
		for(int k=0;k<total_len;k++)
		{
			str_dash+="-";
		}
		if(i==0)
		{
		
		
		System.out.println(str_dash);
		 String tno="TRAIN_NO";
		 
		 
		 
		 byte[] b=new byte[5];
		 
		 for(int j=0;j<b.length;j++)
		 {
			 b[j]=32;
		 }
		 String empty_spaces=new String(b);
		 
		 System.out.print("|"+tno+empty_spaces+"|");
		 
		 String tname="TRAIN_NAME";
		 
		 int tnameLength=tname.length();
		 
		 int len=(max+5)-tnameLength;
		 
		 byte[] b2=new byte[len];
		 
		 for(int j=0;j<b2.length;j++)
		 {
			 b2[j]=32;
		 }
		 
		 String trainNameFull="TRAIN_NAME"+(new String(b2))+"|";
		 
		 System.out.print(trainNameFull);
		 
		 
		 String arr="ARRIVAL";
		 
		 byte[] b3=new byte[5];
		 
		 for(int j=0;j<b3.length;j++)
		 {
			 b3[j]=32;
		 }
		 
		 System.out.print(arr+new String(b3)+"|");
		 
         String dep="DEPARTURE";
		 
		 byte[] b4=new byte[5];
		 
		 for(int j=0;j<b4.length;j++)
		 {
			 b4[j]=32;
		 }
		 
		 System.out.print(dep+new String(b4)+"|");
		 
		 System.out.print("\n");
		 System.out.println(str_dash);
		}
		  
		  int e_spaces="TRAIN_NO".length()+5;
		  e_spaces-=train_no[i].length();
		  byte[] b1=new byte[e_spaces];
		  for(int j=0;j<b1.length;j++)
		  {
			  b1[j]=32;
		  }
		  System.out.print("|"+train_no[i]+new String(b1)+"|");
		  
		  e_spaces=max+5;
		  e_spaces-=train_name[i].length();
		  
		  byte[] b2=new byte[e_spaces];
		  for(int j=0;j<b2.length;j++)
		  {
			  b2[j]=32;
		  }
		  
		  System.out.print(train_name[i]+new String(b2)+"|");
		  
		  e_spaces="ARRIVAL".length()+5;
		  e_spaces-=arrival[i].length();
		  byte[] b3=new byte[e_spaces];
		  for(int j=0;j<b3.length;j++)
		  {
			  b3[j]=32;
		  }
		  System.out.print(arrival[i]+new String(b3)+"|");
		  
		  e_spaces="DEPARTURE".length()+5;
		  e_spaces-=departure[i].length();
		  byte[] b4=new byte[e_spaces];
		  for(int j=0;j<b4.length;j++)
		  {
			  b4[j]=32;
		  }
		  System.out.print(departure[i]+new String(b4)+"|");
		  
		  System.out.print("\n");
		  System.out.println(str_dash);
		  
		  
		  
		  
		
		
		i++;
		
	}while(i<num_of_trains);
	
		

	}

}
