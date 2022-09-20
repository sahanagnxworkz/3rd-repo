class Card{
	 static String []type;
	static float height;
 static  float width;
static long price;
static String colors;
	static void cardDetails(){
		
		System.out.println("the height:"+height);
		System.out.println("the width:"+width);
		System.out.println("the price:"+price);
		System.out.println("the color:"+colors);
		System.out.println("the type is:"+type);
		if(type!=null){
			System.out.println("ref");
			System.out.println("the length of the array:"+Card.type.length);
			
			for(int index=0;index<Card.type.length;index++){
				
		System.out.println("the name of cards are "+Card.type[index]+" position :"+index);
		}
		}
		else
		{
			System.out.println("not ");
		}
	
		
	}
	}
