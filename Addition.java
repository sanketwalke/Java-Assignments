public class Addition{
public  int add(int a,int b){
int s = a + b;
return s;
}
public  double add(double a, double b){
double s = a+ b;
return s;
}
public  float add(float a, float b)
{
float s = a+ b;
return s;
}
public void add()
{
int a = 10;
int b = 20;
int s = a+b;
System.out.println("add using void:"+s);
}

public static void main(String args[])
{
Addition a = new Addition ();
a.add();
System.out.println("Addition is:"+a.add(4,2));
System.out.println("Addition of float  is:"+a.add(5.2f,2.8f));
System.out.println("Addition  double is:"+a.add(14.2,.92));
}
}


 