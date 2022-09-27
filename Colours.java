class Colours{
	static String[] names={null,null,null,null,null,null};
	static int position=0;
	
	static void save(String name){
		if(name!=null && name.length()>3){
			names[position]=name;
		System.out.println("Color name :"+name);
		position++;
		}
		else
		{
			System.err.println("array name exceed");
		}
	}
	
	static void displayDetails(){
		
		for(int index=0;index<names.length;index++){
		System.out.println(names[index]);
			
		}
	}
	static boolean search(String name){
		for(int find=0;find<names.length;find++){
			String ref=names[find];
		if(ref==name){
			System.out.println("Color found: "+name);
			return true;
		}
		}
	
	return false;
	}
	
	}
