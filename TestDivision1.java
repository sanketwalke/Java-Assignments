import java.util.*;
public class TestDivision1{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c;
c = a+b;
System.out.println("Addition is:"+c);
int d;
try{

d = a / b;
}
catch(Exception e){
System.out.println("Number cannot be divisible by Zero"+e);
}
int s;
s = a - b;
System.out.println("Substraction is :"+s);
}
}
 










