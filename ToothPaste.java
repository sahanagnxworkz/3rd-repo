class ToothPaste{
	static String name="Colgate";
	static int typeOfBrands ;
	static String nameofBrands;
	static double price;
	static String flavor;
	static String flavor1;
	static int size;
	static String healthy;
	static boolean offer;
	
	static void setName(String value){
	
		name=value;
	}
	static String getName(){
		System.out.println("the name of brand: "+name);
		return name;
	}
	
	static void setTypeOfBrands(int numbers){
		typeOfBrands=numbers;
		
	}
	static int getTypeOfBrands(){
		typeOfBrands=9;
		System.out.println("the no of different brands: "+typeOfBrands);
		return 0;
	}
	static void setNameOfBrands(String brand){
		nameofBrands=brand;
	}
	static String getNameOfBrands(){
		System.out.println("the new brand:"+nameofBrands);
		return nameofBrands;
	}
	
	static void setPrice(double amount){
		price=amount;
	}
	static double getPrice(){
		System.out.println("the price of the paste:"+price);
		return price;
	}
	
	static void setFlavor(String taste){
		flavor=taste;
	}
	static String getFlavor(){
		System.out.println("the falvor of the paste:"+flavor);
		return flavor;
	}
	
	static void setSize(int length){
		size=length;
	}
	static int getSize(){
		System.out.println("the length of Paste:"+size);
		return 0;
	}
	
	static void isHealthy(String good){
		healthy=good;
	}
	static String isHealthy(){
		System.out.println("this  Paste:"+healthy);
		return healthy;
	}
}