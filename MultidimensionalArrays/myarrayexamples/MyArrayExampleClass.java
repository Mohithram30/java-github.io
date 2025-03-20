package test.myarrayexamples;

public class MyArrayExampleClass {

	public MyArrayExampleClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char[] cArr=new char[26];
		
		for(int i=0;i<26;i++) {
			cArr[i]=(char)(i+65);
			
			System.out.println("The character at position:"+i+" is:"+cArr[i]);
		}
		
		System.out.println("The array is :"+cArr.toString());
		
		String[] fName= {"Rajesh","Ramesh","Rakesh","Anand","Sathish","Radhika"};
		String[] lName= {"Prakash","Raghu","raju","Chris","David","Rehman"};
		int[] age= {20,22,19,20,23,22};
		String[] gender= {"male","male","male","male","male","female"};
		String[] phoneNumber= {"9988877456","9988877456","9988877456","9988877456","9988877456","9840654503"};
		
		Student[] classRoom1=new Student[6];
		
		int counter=0;
		
		while(counter<classRoom1.length)
		{
			
			
			classRoom1[counter]=new Student(fName[counter],lName[counter],age[counter],phoneNumber[counter],gender[counter]);
			
			System.out.println("===========================================");
			System.out.println("Student FirstName:"+classRoom1[counter].fName);
			System.out.println("Student LastName:"+classRoom1[counter].lName);
			System.out.println("Student age:"+classRoom1[counter].age);
			System.out.println("Student PhoneNumber:"+classRoom1[counter].phoneNumber);
			System.out.println("Student Gender:"+classRoom1[counter].gender);
			
			
			
			
			counter++;
		}
		System.out.println("===========================================");
		
		
		

	}

}
