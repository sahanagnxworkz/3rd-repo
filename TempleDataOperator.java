class TempleDataOperator{
	static String[] templeName={null,null,null,null,null,null,null};
	static int position=0;
    static void list(String name){
	System.out.println("save:temple name");
	templeName[position]=name;
	position++;
	System.out.println("the temple name:"+templeName[position] + " @ position "+position);
	}
 static void displayDetails(){
	
	for(int index=0;index<=templeName.length-1;index++){
		System.out.println("the temple name:"+templeName[position] + " @ position "+position);
		
	 
	}
 }
public static void main(String[] name){
	 System.out.println("main entered");
	 String ref="Basaveshwara";
	 TempleDataOperator.list(ref){
		 System.out.println()
	 }
	 TempleDataOperator.displayDetails();
	 
}
}