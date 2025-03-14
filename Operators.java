public class Operators 
{
public static void add(int a,int b,int c)
{
  System.out.println("The value is :"+a);
  System.out.println("The value is :"+b);
  System.out.println("The value is :"+c);
  System.out.println("Addition :" +(a+b+c));
}
public static void sub(int a,int b,int c)
{
  System.out.println("The value is :"+a);
  System.out.println("The value is :"+b);
  System.out.println("The value is :"+c);
  System.out.println("sub :" +(a-b-c));
}
public static void mul(int a,int b,int c)
{
  System.out.println("The value is :"+a);
  System.out.println("The value is :"+b);
  System.out.println("The value is :"+c);
  System.out.println("mul : "+(a*b*c));
}
public static void div(int a,int b,int c)
{
  System.out.println("The value is :"+a);
  System.out.println("The value is :"+b);
  System.out.println("The value is :"+c);
  System.out.println("div : "+(a/b/c));
}

public static void main(String args [])
{
 Operators ad =new Operators();
            ad.add(8,8,8);
            ad.sub(72,36,2);
            ad.mul(6,6,6);
            ad.div(86,2,2);
}
}
