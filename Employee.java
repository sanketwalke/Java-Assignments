class Employee{
int sal=50000;
public void display()
{
System.out.println("Hi from Employee class");
}
}
public class Overriding extends Employee{
int bonus=10000;
public void display()
{
System.out.println("Hi from Overriding class");
}
public static void main(String args[])
{
 Overriding p=new Overriding();



p.display();
}
}