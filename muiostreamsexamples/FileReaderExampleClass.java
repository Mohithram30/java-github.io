package test.muiostreamsexamples;
import java.io.*;

public class FileReaderExampleClass {

	public FileReaderExampleClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		
		BufferedReader br=null;
		try
		{
			fr=new FileReader("C:/Users/DELL/Desktop/file2.txt");
			br=new BufferedReader(fr);
			
			String str;
			
			
			while((str=br.readLine())!=null)
			{
				
				System.out.println(str);
				System.out.println("=================================================");
				
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				fr.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}

	}

}
