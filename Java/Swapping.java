public class Swapping {
    public static void main(String args[]) {
        int x = 10, y=5;
        //x = 5, y = 10;
        x = x + y; // x = 10+5 = 15
        y = x - y; // y ==> 15 - 5 = 10
        x = x - y; // x ==> 15 - 10 = 5
        
      System.out.println("x = "+x+", y = "+y);
      
        x = x * y; // x = 10 * 5 = 50
        y = x / y; // y ==> 50 / 5 = 10
        x = x / y; // x ==> 50 / 10 = 5
      System.out.println("x = "+x+", y = "+y);
      
      //XOR
      //1010
      // 101
        x = x ^ y; 
        y = x ^ y; 
        x = x ^ y; 
      System.out.println("x = "+x+", y = "+y);
      
    }
}