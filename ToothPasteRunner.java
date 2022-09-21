class ToothPasteRunner{
	public static void main(String[] args){
		String name="Dabbur";
	ToothPaste.setName(name);
	String ref=ToothPaste.getName();
		System.out.println(ref);
	
		int typeOfBrands=9;
		ToothPaste.setTypeOfBrands(typeOfBrands);
		int no=ToothPaste.getTypeOfBrands();
		System.out.println(no);
	
	   String nameofBrands="closeUp";
	   ToothPaste.setNameOfBrands(nameofBrands);
	   ToothPaste.getNameOfBrands();
	
	
		double amount=80.9d;
		ToothPaste.setPrice(amount);
	    double price = ToothPaste.getPrice();
		System.out.println(price);
		
		String taste="Chocolate";
		ToothPaste.setFlavor(taste);
		String flavor=ToothPaste.getFlavor();
		System.out.println(flavor);
		
		int length=15;
		ToothPaste.setSize(length);
		int size=ToothPaste.getSize();
		System.out.println(size);
		
		String check="Good";
		ToothPaste.isHealthy(check);
		ToothPaste.isHealthy();
		
	
}
}