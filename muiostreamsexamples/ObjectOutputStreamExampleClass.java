package test.muiostreamsexamples;
import java.io.*;

public class ObjectOutputStreamExampleClass {

	public ObjectOutputStreamExampleClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		try
		{
			fos=new FileOutputStream("C:/Users/DELL/Desktop/ObjectFile.txt");
			oos=new ObjectOutputStream(fos);
			
			DateClass dc=new DateClass(6,8,2025);
			
			DateClass dc2=new DateClass(2,1,2026);
			
			oos.writeObject(dc);
			oos.writeObject(dc2);
			oos.flush();
			fos.flush();
			
			System.out.println("Object written successfully");
		}
		catch(IOException ioe)
		{
		 ioe.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
				fos.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}

	}

}
