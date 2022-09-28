class DataOfBillionariesRunner{
	public static void main(String[] data){
		System.out.println("*********main entered*************");
		
		DataOfbillionaries.save("RathanTata");
		DataOfbillionaries.save("MukeshAmbani");
		DataOfbillionaries.save("GautamAdani");
		DataOfbillionaries.save("ShivNadar");
		DataOfbillionaries.save("Radhakishan");
		DataOfbillionaries.save("Cyrus");
		DataOfbillionaries.save("Lakshmi");
		DataOfbillionaries.save("Savitri");
		DataOfbillionaries.save("Sudha");
		DataOfbillionaries.save("UdayBiral");
		
		
		DataOfbillionaries.displayDetails();
	     boolean ref=DataOfbillionaries.find("Sudha");
		System.out.println(ref);
		
		DataOfbillionaries.update("Sudha","Sahana");	
		System.out.println("--------------------");
		String newName="SudhaMurthy";
		String changed=DataOfbillionaries.update(1,newName);
		System.out.println(changed);
		System.out.println("--------------------");
		boolean del=DataOfbillionaries.delete("Savitri");
	     System.out.println(del);
		 System.out.println("--------------------");
		 int index=9;
		boolean delInt=DataOfbillionaries.delete(index,"UdayBiral");
		System.out.println("*****************main closed**************");
	}
}