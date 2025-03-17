import abstractionexamples.myjavaclasses.DateClass;



public class DateClassMain
{

public static void main(String[] args)
{

System.out.println("My argument is :"+args[0]);

DateClass dc=DateClass.checkDate(25,2,2024);


if(dc!=null)
{

dc.displayDate();

}
else
{

System.err.println("Sorry, Date object not created. Check your date parameters");


}





}





}