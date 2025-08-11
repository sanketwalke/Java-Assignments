import java.util.*;
public class Student11{
int r_no;
String name;
int marks;

public Student11(int r_no,String name,int marks){
this.r_no = r_no;
this.name = name;
this.marks = marks;
}
void display ()
{
System .out.println("Students Info:");
System .out.println("Roll_no is:"+r_no);
System .out.println("Name is:"+name);
System .out.println("Marks:"+marks);
}
public static void main(String args[])
{
Student11 s= new Student11(114,"SANKET",96);
s.display();
}
}

