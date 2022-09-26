class MovieDataOperator{
	 String[] save={null,null,null,null,null,null,null};
	int position=0;
    static void list(){
	System.out.println("movie name");
	}
 static void displayDetails(){
   
	
	for(int index=0;index<save.length;index++){
		System.out.println("the temple name:"+save[index] + " @ position "+index);
		
	 
	}
 }
public static void main(String[] name){
	 System.out.println("main entered");
	 MovieDataOperator.displayDetails();
	
}
}