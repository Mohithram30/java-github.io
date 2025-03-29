package test.muiostreamsexamples;
import java.io.*;

public class FileWriterExampleClass {

	public FileWriterExampleClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileWriter fw=null;
		
		try
		{
			fw=new FileWriter("C:/Users/DELL/Desktop/MyFile3.txt",true);
			
			fw.write("I am new content \n");
			fw.flush();
			
			System.out.println("File written successfully");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}

	}

}
