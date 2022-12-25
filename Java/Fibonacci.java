public class Fibonacci {
    public static void main(String args[]) {
      
      int n = 8, counter=2, temp=0;
      int n1 = 1, n2 = 1;
      //1    1    2    3 
      //n1   n1   n1  n2 
      if(n==1){
          
          System.out.print(n1);
          return;
      }
      if(n==2){
          System.out.print(n1+" "+n2);
          return;
      }
      if(n>2){
           System.out.print(n1+" "+n2+" ");
      }
      while(counter<n){
          System.out.print(n1+n2+" " );
          temp = n1;
          n1 = n2;
          n2 = temp+n2;
          counter++;
          
      }
      
      //System.out.println("Fibonacci.." );
      
    }
}
