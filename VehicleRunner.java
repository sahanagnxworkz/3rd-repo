class VehicleRunner{
public static void main(String[] args){
		String source="Bangalore";
		String destination="Donnehalli";
	double ref0=Vehicle.transport(source,destination);
		System.out.println("the distance is:"+ref0);
	
	    System.out.println("-----------------------------------");
	
		int ontime=2;
	double ref1=Vehicle.transport(source,destination,ontime);
		System.out.println(ref1);
		
		System.out.println("-----------------------------------");
		
		destination="Davanagere";
	boolean ref2=Vehicle.transport(destination);
	    System.out.println(ref2);
	
	    System.out.println("-----------------------------------");
		
	boolean ref3=Vehicle.transport(destination,ontime);
		System.out.println(ref3);
		
		System.out.println("-----------------------------------");
		
	boolean ref4=Vehicle.transport(ontime);
	     System.out.println(ref4);
}
}