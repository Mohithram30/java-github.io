public class BirdMain
{

public static void main(String[] args)
{
Chicken c=new Chicken();
Eagle e=new Eagle();

System.out.println("The number of legs of Chicken is :"+c.legs);
System.out.println("Can Chicken Fly??:"+c.canFly);
System.out.println("Calling display Method:");
c.display();

System.out.println("The number of legs of eagle is :"+e.legs);
System.out.println("Can Eagle Fly???:"+e.canFly);

}




}