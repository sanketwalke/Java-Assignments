import java.util.*;
public class Area
{
void triangle(int base,int height)
{
double res=base*height*0.5;
System.out.print("The area of triangle is:"+res);
System.out.println();
}
void circle(double radius){
double res=radius*radius*Math.PI;
System.out.print("The area of Cirlce is:"+res);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1;
while(i!=0)
{
Area obj=new Area();

System.out.print("Enter Base of triangle:");
int base=sc.nextInt();
System.out.print("Enter Height of triangle:");
int height=sc.nextInt();

obj.triangle(base,height);

System.out.print("Enter Radius of circle:");
Double radius=sc.nextDouble();
obj.circle(radius);
System.out.print("\nDo you want to continue (1) exit(0):");
i=sc.nextInt();
}
}
}