class TempleDataOperator{
	static String[] templeName={null,null,null,null,null,null,null};
	static int position=0;
    static void list(){
	System.out.println("temple name");
	}
 static void displayDetails(){
	String[] templeName={"Basaveshwara","Tirupathi","Dharmasthala","Kaasi","chammundi","SriShyla","Mantralaya"}; 
	
	for(;position<=templeName.length-1;){
		System.out.println("the temple name:"+templeName[position] + " @ position "+position);
		position++;
	 
	}
 }
public static void main(String[] name){
	 System.out.println("main entered");
	 TempleDataOperator.displayDetails();
}
}