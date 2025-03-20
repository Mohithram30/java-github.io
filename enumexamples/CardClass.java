package test.enumexamples;

public class CardClass {
	
	Cards c;
	
	enum Cards{
		Spade(13),
		Diamond(13),
		Clover(13),
		Heart(13);
		
		int size;
		int number;
		
		Cards(int size)
		{
			this.size=size;
		}
		
		int setNumber(int number)
		{
		if(number>size)
		{
			System.err.println("Number cannot be greater than 13");
			this.number=0;
			
		}
		else
		{
			this.number=number;
		}
		return this.number;
		}
	}
		
		
		
	public Cards setCard(String cardName)
	{
		this.c=Cards.valueOf(cardName);
		return this.c;
	}
		
		
		
		
		
		
		
		
	

}
