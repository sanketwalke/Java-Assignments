class Player{
public Player(String game)
{
System.out.println("In the constructor of player:"+game);
}
}
public class Batsman extends Player{
public Batsman(){
super("Cricket");
System.out.println("In the constructor of Batsman:");
}
public static void main(String args[]){
Batsman b = new Batsman();
}
}