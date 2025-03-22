package test.mystringexamples;

public class MyStringMethodsClass {

	public MyStringMethodsClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="Dhinakar,Rajesh,Anand,Ramesh,How are you??";
		
		String str2=str1.substring(0,str1.lastIndexOf(","));
		
		String str4=str1.substring(str1.indexOf(",")+1 , str1.indexOf(",",str1.indexOf(",")+1));
		String str5=str1.substring(str1.indexOf(",",str1.indexOf(",")+1)+1    
				                   ,str1.indexOf(",",str1.indexOf(",",str1.indexOf(",")+1)+1));
		
		System.out.println(str1);
		System.out.println(str2);
		
		byte[] b={65,66,67,32,32,68,69,70};
		
		String str3=new String(b);
		
		System.out.println(str3);
		
		System.out.println(str4);
		
		System.out.println(str5);
		
		int code=str1.codePointAt(str1.indexOf("A"));
		
		System.out.println("ASCII code of space is :"+code);
		
		
		String str6="Apples;Banana,Kiwi,Grapes,Orange";
		
		String[] sArr=str6.split(",");
		
		for(int i=0;i<sArr.length;i++)
		{
			if(sArr[i].indexOf(";")!=-1)
			{
				System.out.println(sArr[i].substring(0,sArr[i].indexOf(";")));
				System.out.println(sArr[i].substring(sArr[i].indexOf(";")+1));
			}
			else
			{
			System.out.println(sArr[i]);
			}
			
		}
		
		
		
		

	}

}
