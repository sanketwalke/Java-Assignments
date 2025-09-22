public class FinallyBlock {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); 
        } 
         catch (NullPointerException e) {
            System.out.println("Null value error!");
        }
          finally {
            System.out.println("Finally block always runs.");
        }
    }
}
