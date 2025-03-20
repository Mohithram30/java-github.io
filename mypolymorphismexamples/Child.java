package test.mypolymorphismexamples;

public class Child extends Father{
	
 public String returnPanCard()
	{
		return "Child PanCardNumber:THJKL088D";
	}
 
 public void printMe()
 {
	 System.out.println("I am Child");
 }
 
 public String toString()
 {
	 return "I am Child";
 }

}
