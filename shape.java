//overloading


import java.util.*;
public class shape{
public void area()
{
int L = 20;
int B = 15;
int T = L * B;
System.out.println("Area of rectangle is :"+T);
}
public double area(int R){
double T = 3.14 * R * R;
return T;
}
public float area(int B,int H){
 float T = 0.5f*B*H;
return T;
}
public static void main(String args[]){
shape s = new shape();
s.area();
System.out.println("Area of circle is:"+s.area(15));
System.out.println("Area of triangle is :"+s.area(4,15));
}
}
 