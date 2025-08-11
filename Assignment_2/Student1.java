import java.util.*;
public class Student1{
int r_no;
String name;
int marks;

public Student1(int r_no,String name,int marks){
r_no = r_no;
name = name;
marks = marks;
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
Student1 s= new Student1(114,"SANKET",96);
s.display();
}
}

