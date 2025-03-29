package test.muiostreamsexamples;

import java.io.*;

public class MyIOStreamExampleClass {

	public MyIOStreamExampleClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*File f=new File("C:/Users/DELL/Desktop");
		
		System.out.println("Is the file a directory??:"+f.isDirectory());
		
		if(f.isDirectory())
		{
			
			File[] fArray=f.listFiles();
			
			for(int i=0;i<fArray.length;i++)
			{
				System.out.println("The file number:"+i+" is :"+fArray[i].getName()+".The absolute path is :"+fArray[i].getAbsolutePath());
				
				System.out.println("The file total space of file number "+i+" is :"+fArray[i].getUsableSpace()/Math.pow(10,9)+"GB");
			}
			
			
			
		}*/
		
		File f2=new File("C:/Users/DELL/Desktop/myfile.txt");
		
		
		FileInputStream fis=null;
		
		try
		{
		
			
			fis=new FileInputStream(f2);
			int available=fis.available();
			
			System.out.println("The total number of bytes is :"+available);
			
			byte[] b=new byte[available];
			
			while(fis.read(b,0,available)!=-1)
			{
				for(int k=0;k<b.length;k++)
				{
				System.out.println("The byte is :"+b[k]);
				}
			}
			
			String str=new String(b);
			
			System.out.println(str);
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
			
		}
		
		}

}
