class ColoursRunner{
public static void main(String[] args){
System.out.println("main enterd");
Colours.save("Blue");
Colours.save("White");
Colours.save("Red");
Colours.save("Black");
Colours.save("Green");
Colours.save("Orange");

Colours.displayDetails();

boolean ref=Colours.search("Black");
System.out.println(ref);
System.out.println("main closed");
}

}