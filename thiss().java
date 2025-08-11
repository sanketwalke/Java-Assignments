public class thiss{

int a;
int b;

thiss(){
System.out.println("No argument");
this(10,20);
}
thiss(int a,int b){
int c=a+b;
System.out.println("Ans is "+c);
}

public static void main(String [] args){

thiss obj=new thiss();


}
}