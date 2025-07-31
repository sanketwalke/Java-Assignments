import java.util.*;

public class Factorial1 {

public int fact(int n)
{
int Total=1;
if(n>=1)
{
Total=n*fact(n-1);
}
return Total;

}
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
Factorial1 f = new Factorial1();
int num = sc.nextInt();
int ans = f.fact(num);
System.out.println("Factorial of the number is: "+ans);
}
}