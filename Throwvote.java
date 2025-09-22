import java.util.*;
class Throwvote {
public static void main (String args[]){
System.out.println("Enter Your Age:");
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
if(age < 18){
System.out.println("You are not eligible:");
}
else{
System.out.println("Welcome to voting management system");
System.out.println("1.Xyz 2.Pqr 3.Stk");
}
}
}
