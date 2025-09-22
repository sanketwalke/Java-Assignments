//inheritance
import java.util.*;
class Employee{
int Salary = 60000;
public void display(){
System.out.println("Int Employee is:");
}
}
public class programmer extends Employee
{ int bonus = 12000;
public void show(){
System.out .println("Int programmer is:");
}
public static void main(String args[])
{ 
 programmer P = new programmer();
int total = P.Salary + P.bonus ;
System.out.println("Total salary is :" +total);
P.show();
P.display();
}
}
