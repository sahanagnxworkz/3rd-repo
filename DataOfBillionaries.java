class DataOfbillionaries{
	static String[] names={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	
	 static void save(String name){
		 
		 if(name!=null && name.length()>4){
		 names[position]=name;
		 position++;
		 System.out.println("Billionaires  Name:"+name);
		 }
		 else{
			 System.out.println("array name exceed");
		 }
	 }
	 static void displayDetails(){
	 for(int index=0;index<names.length;index++){
		 System.out.println("the name of person :"+names[index] + " at position "+index);
	 
	 }	 
	 }
	 static boolean find(String name){
		 System.out.println("-------searching for a name------");
			for(int search=0;search<names.length;search++){
				String ref= names[search];
				if(ref==name){
					
					System.out.println("name found: "+name);
				return true;
				}
				
			}
			return false;	
	 }
	 static String update(String oldName,String newName){
		 System.out.println("----update entered------");
		 if(oldName!=null && newName!=null){
			 if(oldName.length()>4 && newName.length()>4){
				 for(int update=0;update<names.length;update++){
					 
					 String ref=names[update];
					 if(ref==oldName){
						 names[update]=newName;
						 System.out.println("name matched to new one: "+newName);				
						System.out.println("-------checking-------");
						displayDetails();
					    return newName;
					}
				 }
			 }
		 }
		 return "not found";
	 }
	 static String update(int change,String newName){
		 if(newName!=null){
			 for(int index=0;index<names.length;index++){
				 if(index==5){
					 String ref=names[index];
					 names[index]=newName;
				System.out.println(newName); 
				displayDetails();
			 }
		 }
		 
	 }
	  return newName;
	 }
	 static boolean delete(String billionarie){ 
			if(billionarie.length()>=4)	
			{
				for(int index=0;index<names.length;index++){
					if(index==3){
						String ref3=names[index];
						names[index]=null;
						System.out.println("the name of billionarie:"+billionarie +" at index: "+index +" will changes to :"+names[index]);
						displayDetails();
						return true;
					}
				}
	 }
	 return false;
	 }

	 
	 static boolean delete(int index,String billionarie){
		 if(index==9){
			 String ref9=names[index];
			 names[index]=null;
			 System.out.println("the name of ref9: "+names[index]);
			 displayDetails();
			 return true;
		 }
		 return false;
	 }
}	 
	 