package test.mypolymorphismexamples;

public class AdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Addition ad=new Addition()
		Addition ad=new Addition(50,50);
		Addition ad2=new Addition("Rajendran","Prakash");
		
		ad.add();
		ad2.add();
		ad.add(40,30);
		
		ad2.add(20,10);
		

	}

}
