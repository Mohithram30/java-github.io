package test.enumexamples;

public class CardsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CardClass cc=new CardClass();
		
		
		cc.setCard("Spade");
		
		cc.c.setNumber(14);
		switch(cc.c.number)
		{
		case 1:
			System.out.println("Number on card is A");
			break;
		
		case 11:
			System.out.println("Number on card is J");
			break;
		case 12:
			System.out.println("Number on card is Q");
			break;
		case 13:
			System.out.println("Number on card is K");
			break;
		default:
			System.out.println("Number on card is:"+cc.c.number);
		
			
		}
		System.out.println("The card is :"+cc.c);
		
		System.out.println("The max size is :"+cc.c.size);
		

	}

}
