import java.util.*;
class employee {
int salary = 60000;
}
public class Devopps extends employee {
int salary = 75000;
public void salary(){
System.out.println("Salary Devopps is:"+salary);
System.out.println("Salary employee is:"+super.salary);
}
public static void main(String args[]){
Devopps d = new Devopps();
d.salary();
}
}
