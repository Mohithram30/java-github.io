package test.myarrayexamples;

public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	String fName;
	String lName;
	int age;
	String phoneNumber;
	Gender gender;
	
	
	enum Gender{
		male,
		female;
	}
	
	public Student(String fName,String lName,int age,String phoneNumber,String gender)
	{
		this.fName=fName;
		this.lName=lName;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.gender=Gender.valueOf(gender);
	}

}
