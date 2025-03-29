package test.muiostreamsexamples;

import java.io.*;

public class ObjectInputStreamClassExample {

	public ObjectInputStreamClassExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		
		try
		{
			fis=new FileInputStream("C:/Users/DELL/Desktop/ObjectFile.txt");
			ois=new ObjectInputStream(fis);
			
			DateClass dc=(DateClass)ois.readObject();
			
			System.out.println("The day is :"+dc.day);
			System.out.println("The month is :"+dc.month);
			System.out.println("The year is :"+dc.year);
			
			DateClass dc2=(DateClass)ois.readObject();
			
			System.out.println("The day is :"+dc2.day);
			System.out.println("The month is :"+dc2.month);
			System.out.println("The year is :"+dc2.year);
			
            DateClass dc3=(DateClass)ois.readObject();
			
			System.out.println("The day is :"+dc3.day);
			System.out.println("The month is :"+dc3.month);
			System.out.println("The year is :"+dc3.year);
			
		}
		catch(ClassNotFoundException cfe)
		{
			cfe.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
				fis.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}

	}

}
