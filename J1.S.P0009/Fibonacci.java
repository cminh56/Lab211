


public class Fibonacci {

    
    public static int fibo(int n){
        // f(0) = 0 f(1) = 1
        if(n < 2) return n; 
        // f(n) = f(n -1) + f(n -2)
        return fibo(n - 1 ) + fibo (n - 2);
          
    }
    
    

   
}