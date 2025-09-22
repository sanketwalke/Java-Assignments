 class College{
String College_name="Sanjivani COE";
String Address="Kopargaon";
int Code=215251;
void getInfo(){
System.out.println("College info");
System.out.println("College name:"+College_name);
System.out.println("College Code"+Code);
System.out.println("College Address: "+Address);
}
}
public class Student_ID extends College{
String name;
int ID;
String Branch;
Student_ID(String name,int ID,String branch)
{
this.name=name;
this.ID=ID;
this.Branch=branch;
}
void getInfo1(){
System.out.println("Student info");
System.out.println("name:"+name);
System.out.println("ID: "+ID);
System.out.println("Branch :"+Branch);
}
public static void main(String args[])
{
Student_ID obj=new Student_ID("Sanket",114,"IT");
obj.getInfo1();
obj.getInfo();
}
}

