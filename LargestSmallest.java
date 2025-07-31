import java.util.*;
public class LargestSmallest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		
if(a == b)
{System.out.println("Both are Equal");
}
else if(a>b)
{
	System.out.println(a+ " is Larger ");
	System.out.println(b+" is Smaller");

}
else
{
	System.out.println(b+ " is Larger ");
	System.out.println(a+" is Smaller");



}
		//int c = Math.max(a,b);
		//int d= Math.min(a,b);





}
}