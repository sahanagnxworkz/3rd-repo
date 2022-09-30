1.Platform Independence
      a.platform is combination of hardware and software use to perform some opeartion.
	  b.In Java byteCode is platform independent
	  c.byte code is only one which understood by JVM
	  
2.Primitive and nonprimitive
primitive datatypes:
here according to value range we can declare a datatype 
depends on the range of value

there are 8 primitive datatypes:
1.byte 
2.short
3.int
4.float
5.long
6.double
7.char
8.boolean

Non-primitive datatype:
declare n number of values using datatype
1.String: Sequence of character use store a value,we can assign any special characters also.
assign a value using "Sahana.
2.Array: It is container ,use to store same data using a Reference.
there are 2 ways to intialize 
	1.using a keyword :new
	2.using curly braces:{}


3.Class and its members

class :	class is nothing but collection of objects
class consists of datatypes,varibales,methods, etc
using a class name we can invoke a method 
members :
anything we used in class called members
1.method
2.classname
3.dataypes
4.static






4.program to accept 2 Inputs total marks and received marks,calculate percentage and return

 class Program{
	 static double mark1=70;
	 static double mark2=80;
	 static double revMark;
	 
	 
	 
	 static double calculate(){
		 revMark=mark1+mark2;
		 System.out.println("received Marks:"+revMark);
		 double percentage=0;
		 percentage=revMark/200;
		 percentage=percentage*100;
		 System.out.println(percentage);
		 return percentage;
	 }
	 public static void main(String[] args){
		 double ref=Program.calculate();
		 System.out.println(ref);
	 }
 }
 
 5.remove dupicates in array
 int[] values={34,78,90,53,34,11,53,15,78,91,8,4,67,11}
 
 6.main method with the memory it exceutes in
   we can compile a program without main method but we cannot excutes without it.
   while executing JVM always looksFor main method called:
   public static void main(String[] args){
	   
   } 
   which consists of access-specifiers,non access-specifiers,
   return type,method name,paranthesis,parametersand body of the program
 
 
 7.reverse number
 class ProgramInt{
	public static void main(String[] args){
	
			int[] number={1,2,9,6,8};
			String rev="";
			
			for(int index=number.length-1;index>=0;index--){
				System.out.println("number:"+number[index]);
				rev=rev+number[index];
			}
				System.out.println(rev);
			
	}
}


7.find a hour into seconds
 
 class Hour{
	public static void main(String[] args){
		
		float hour=0;
		float sec=0;
		float min=60;
		if(hour==0){
			hour++;
			sec=min+min;
			System.out.println(sec);

		}

	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 