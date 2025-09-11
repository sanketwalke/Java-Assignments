import java.util.*;
class player {
 public player(){
System.out.println("In player construtor:");
}
}
public class Play extends  player{
public Play(String game){
super();
System.out.println("In play constructor:"+game);
}
public static void main(String args[]){
Play p = new Play("Cricket");
}
}
 