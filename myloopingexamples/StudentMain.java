package myjavaclass;

public class StudentMain {

	

	public static void main(String[] args) {

		String[] first_name= {"Ajith","Ranjith","Thiru","kishore","Mani"};
		String[] last_name= {"Pandian","kumar","navukarasu","kannan","Barathi"};
		String[] age= {"22","21","23","20","22"};
		String[] phone_number= {"9042666263","9999955555","9087765434","9545495454","9999999918"};
		
		int max=0;
		int counter=0;
		while(counter<first_name.length)
		{
		  if(first_name [counter].length()>max)
		  { max=first_name[counter].length();  
	}
     counter++;
}
//    int total_len="FIRSTNAME".length()+max"LASTNAME".length"AGE".length"PHONENUMBER".length()+25;
	  int total_len = "FIRSTNAME".length() + max + "LASTNAME".length() + "AGE".length() + "PHONENUMBER".length() + 17;
      int i=0;
      int num_first_name=first_name.length;
      
      
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
  		 String tno="FIRSTNAME";
  		 
  		 
  		 
		 byte[] b=new byte[5];
		 
		 for(int j=0;j<b.length;j++)
		 {
			 b[j]=32;
		 }
		 String empty_spaces=new String(b);
		 
		 System.out.print("|"+tno+empty_spaces+"|");
		 
		 String tname="LASTNAME";
		 
		 int tnameLength=tname.length();
		 
		 int len=(max+5)-tnameLength;
		 
		 byte[] b2=new byte[len];
		 
		 for(int j=0;j<b2.length;j++)
		 {
			 b2[j]=32;
		 }
          String lastName="LASTTNAME"+(new String(b2))+"|";
		 
		 System.out.print(lastName);
		 
		 
		 String agg="Age";
		 
		 byte[] b3=new byte[5];
		 
		 for(int j=0;j<b3.length;j++)
		 {
			 b3[j]=32;
		 }
		 
         System.out.print(agg+new String(b3)+"|");
		 
         String pho="PHONENUMBER";
		 
		 byte[] b4=new byte[5];
		 
		 for(int j=0;j<b4.length;j++)
		 {
			 b4[j]=32;
		 }
      
        System.out.print(pho+new String(b4)+"|");
		 
		 System.out.print("\n");
		 System.out.println(str_dash);
		}
      
      
  		 
		  int e_spaces="FIRSTNAME".length()+5;
		  e_spaces-=first_name[i].length();
		  byte[] b1=new byte[e_spaces];
		  for(int j=0;j<b1.length;j++)
		  {
			  b1[j]=32;
		  }
		  System.out.print("|"+first_name[i]+new String(b1)+"|");
		  
		  e_spaces=max+5;
		  e_spaces-=last_name[i].length();
		  
		  byte[] b2=new byte[e_spaces];
		  for(int j=0;j<b2.length;j++)
		  {
			  b2[j]=32;
		  }
      
          
         System.out.print(last_name[i]+new String(b2)+"|");
		  
		  e_spaces="Age".length()+5;
		  e_spaces-=age[i].length();
		  byte[] b3=new byte[e_spaces];
		  for(int j=0;j<b3.length;j++)
		  {
			  b3[j]=32;
		  }
		  System.out.print(age[i]+new String(b3)+"|");
		  
		  e_spaces="PHONENUMBER".length()+5;
		  e_spaces-=phone_number[i].length();
		  byte[] b4=new byte[e_spaces];
		  for(int j=0;j<b4.length;j++)
		  {
			  b4[j]=32;
		  }
		  System.out.print(phone_number[i]+new String(b4)+"|");
		  System.out.print("\n");
		  System.out.println(str_dash);
		  
      
			i++;
			
      	}while(i<num_first_name);
   
      
	}
}
