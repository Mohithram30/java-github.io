package test.muiostreamsexamples;
import java.io.*;

public class DateClass implements Serializable{
	
	int day;
	int month;
	int year;

	public DateClass(int day,int month,int year) {
		// TODO Auto-generated constructor stub
		
		this.day=day;
		this.month=month;
		this.year=year;
	}

}
