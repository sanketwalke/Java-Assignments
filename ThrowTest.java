import java.util.*;

class ThrowTest{
public static void main(String args[]){

int a = 10;
int b = 0;

if(b == 0){
throw new ArithmeticException("Number cannot be divided by zero");
}
else{
int c = a / b;
System.out.println("Division is:"+c);
}
System.out.println("Adddition is:"+(a + b));
}
}