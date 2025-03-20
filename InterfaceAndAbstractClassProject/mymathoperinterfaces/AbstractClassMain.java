package test.mymathoperinterfaces;

public class AbstractClassMain {

	public AbstractClassMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClassExampleParent ap=new AbstractClassExampleChild();
		
		ap.sub();
		ap.add();
		
		int radius=5;
		
		double area=AbstractClassExampleChild.pi*(Math.pow(radius, 2));
		
		System.out.println("The area of circle 1 is :"+area);
		
		
		int radius2=3;
		
		double area2=AbstractClassExampleChild.pi*(Math.pow(radius2, 2));
		
		System.out.println("The area of circle 2 is :"+area2);
		
		

	}

}
