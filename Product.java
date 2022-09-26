class Product{
	
	public static void main(String[] items)
	{
		
		System.out.println("The name of product:"+items[0]);
		System.out.println("The product type: "+items[1]);
		System.out.println("The Price 1: "+items[2]);
		System.out.println("The Price 2: "+items[3]);
		System.out.println("The Quantity: "+items[4]);
		System.out.println("The Quality: "+items[5]);
		
		String name=items[0];
		String type=items[1];
		String price1=items[2];
		String price2=items[3];
		String quantity=items[4];
		String quality=items[5];
		int conPrice1=Integer.parseInt(price1);
		System.out.println("Converted to Integer Price1 :"+conPrice1);
		int conPrice2=Integer.parseInt(price2);
		System.out.println("Converted to Integer Price2 :"+conPrice2);
		if(conPrice1<=30)
		{
			System.out.println("it is worty...");
		}
		else{
			System.out.println("not ");
		}
		if(conPrice2==21){
			System.out.println("the amount is:"+conPrice2);
		}
		else{
			System.out.println("not 21");
		}
		
		int total=conPrice1+conPrice2;
		System.out.println("total amount of the products :"+total);
		Product.materials()	;	
	}	
static void materials()
		{
			int no=8;
			System.out.println("the no :"+no);
			
		}
		
}