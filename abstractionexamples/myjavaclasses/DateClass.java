package abstractionexamples.myjavaclasses;

public class DateClass
{

private int day;
private int month;
private int year;

private DateClass()
{
}

public static DateClass checkDate(int day,int month,int year)
{

if((month==2)&(day>29))
{

System.err.println("Sorry, Day cannot be greater than 29 for month 2");
return null;
}
else
{

DateClass dc=new DateClass();
dc.day=day;
dc.month=month;
dc.year=year;
return dc;


}
}

public void displayDate()
{

System.out.println("The day is :"+this.day);
System.out.println("The month is :"+this.month);
System.out.println("The year is :"+this.year);




}









}