class Vehicle{
	static double transport(String source,String destination){
		System.out.println("the source is:"+source);
		System.out.println("the destination is:"+destination);
		if(source==destination){
			System.out.println(source);
			System.out.println(destination);
			
		}
		
		return 239d;
	}
	static double transport(String source,String destination,int ontime){
		System.out.println("the source is:"+source);
		System.out.println("the destination is:"+destination);
		System.out.println("the time take to reach ontime is:"+ontime);

		return 0;
	}
	
	static boolean transport(String destination){
		if(destination=="Davanagere"){
		System.out.println("the destination is :"+destination);
		return true;
	}
	 System.out.println("the destination is not mathced");
	return true;
}

   static boolean transport(String destination,int ontime){
	   if(destination=="Donnehalli"){
	   System.out.println(ontime);
			System.out.println(destination);
			return true;
	   }
   System.out.println("the destination & timings is not mathced");
   return false;
}
 static boolean transport(int ontime){
	 if(ontime==2){
	 System.out.println("the time is :"+ontime);
	   
 }

return true;
 }

}