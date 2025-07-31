import java.util.*;

public class Swapping {

public static void main(String org[])
{

int a =10;
int b= 20;

System.out.println("Before a is:" +a);
System.out.println("Before b is:" +b);


a=a+b;
b=a-b;
a=a-b;

System.out.println("After a is:" +a);
System.out.println("After b is:" +b);


}
}