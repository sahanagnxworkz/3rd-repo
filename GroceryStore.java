class GroceryStore{
	static String superMarket="Dmart";
	static int noOfDmart=10;
	static String location;
	static long areaDiameter;
	static String items;
	static double noOfItems;
	static String fruits;
	static String noOfFruits;
	static String vegetable;
	static String noOfVegetable;
	static String payment;
	static long price=3487l;
	
	static void setLocation(String place)
	{
		location=place;
	}
	static String getLocation(){
		if(location=="Bangalore"){
			System.out.println("the location of Store :"+location);
			return "true";
		}
		return "false";
	}
	
	
	static void setAreaDiameter(long length){
		areaDiameter=length;
	}
		static long getAreaDiameter(){
			System.out.println("the area is about:"+areaDiameter);
			return 0;
		}
		
	static void setItems(String grains){
		items=grains;
	}
	static String getItems(){
		System.out.println("the name of item :"+items);
		return null;
	}
	

	static void setNoOfItems(int no,String fruits,String vegetable){
		noOfItems=no;
		noOfFruits=fruits;
		noOfVegetable=vegetable;
	}
	static int getNoOfItems(){
		System.out.println("the number of items of fruits & vegetables");
		System.out.println(noOfItems);
		System.out.println(noOfFruits);
		System.out.println(noOfVegetable);
		
		return 0;
	}
	
	static void setPayment(String payMode){
		payment=payMode;
	}
	static String getPayment(){
		System.out.println("The paymnet is in :N"+payment);
		return null;
	}
}