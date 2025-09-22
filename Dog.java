import java.util.*;
class Animal{

public void voice(){
System.out.println("In Animal Class ");
}
}
public class Dog extends Animal{

public void bark()
{
System.out.println("In Dog Class ");

}

public static void main(String[] args)
{
Animal a = new Dog();
a.voice();

}
}