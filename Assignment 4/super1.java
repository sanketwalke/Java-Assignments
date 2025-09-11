import java.util.*;
class Animal
{
String colour = "White";
}
class Cat extends Animal
{
String colour = "Gray";

void showColour(){
System.out.println("The Colour of Cat is: "+colour);
System.out.println("The Colour of Animal is: "+super.colour);
}
}

public class super1
{
public static void main (String args[])
{

Cat c = new Cat();
c.showColour();
}
}