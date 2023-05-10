



public class Main {
    
    public static void main(String[] args) {
        Fibonacci fibonacci =new Fibonacci();
        int n = 45;
//        int count=0;
     System.out.println("There is " + n + " " + "fibonaci number :");
        for (int i = 0; i < n; i++) {
            
           if(i == n){
               System.out.print(fibonacci.fibo(i) +" ");// nếu i = n in ra số fibo và cộng với khoảng trống
              
           }else{
               System.out.print(fibonacci.fibo(i) + ",");// ngược lại nếu không bằng sẽ in ra số fibo cộng thêm dấu phẩy
           }
//            count++;
        }
        
        System.out.println(" ");
//        System.out.println(count);
    }
  
}
