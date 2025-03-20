package test.myexceptionexampleclasses;

public class CustomException extends Exception{
	
	String errorMsg;

	public CustomException(String message) {
		// TODO Auto-generated constructor stub
		errorMsg=message;
		
	}
	
	public String toString()
	{
		return errorMsg;
	}
	
	

}
