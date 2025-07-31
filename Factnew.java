import java.util.*;
public class Factnew
{
    public static void main(String args[] )
{

 int n,fact = 1;
  System.out.println("enter the number");
Scanner s = new Scanner(System.in);
n = s. nextInt();
for (int i=0;i<n;i++)
{
  fact = fact * (n-i);
}
System.out.println("factorial is:"+fact );
}
}
