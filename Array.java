import java.util.*;
public class Array{

public static void main(String orgs[]){
int a[]= new int[5];
int sum=0;
System.out.println("Enter Five Number:");
Scanner s=new Scanner(System.in);

for(i=0; i<5; i++){
a[i]=s.nextInt();
sum=sum+a[i];
}

}
System.out.println("Addition is:"+sum);

}