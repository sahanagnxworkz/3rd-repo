class GroceryStoreRunner{
	public static void main(String[] args){
	
	
	System.out.println("the name of store is:"+GroceryStore.superMarket);
	System.out.println("the no store is:"+GroceryStore.noOfDmart);
	
	
	String place="Bangalore";
	GroceryStore.setLocation(place);
	String location =GroceryStore.getLocation();
	System.out.println(location);
	
	long length=9786765l;
	GroceryStore.setAreaDiameter(length);
	long areaDiameter=GroceryStore.getAreaDiameter();
	System.out.println(areaDiameter);
	
	String grains="Greengram";
	GroceryStore.setItems(grains);
	String items=GroceryStore.getItems();
	System.out.println(items);
	
	int no=10;
	String friuts="5:WaterMelon";
	String vegetable="5-Carrot";
	GroceryStore.setNoOfItems(no,friuts,vegetable);
	int number=GroceryStore.getNoOfItems();
	System.out.println(number);
	
	String payMode="online";
	GroceryStore.setPayment(payMode);
	GroceryStore.getPayment();
	
	System.out.println("the total amount is: "+GroceryStore.price);
	
	
	}
}