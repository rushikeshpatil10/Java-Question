import java.util.*;

public class PrimeNumber {

   public static void fib(int n){
        // if(n == 0 || n== 1){
        //     return n;
        // }
        
        // for(int i =0; i<n; i++){
        //     int fn =  fib(i-1) +fib(i-2);
        //     System.out.println(fn);
        // }

        // return 0;

        // int n1 = 0, n2 = 1, n3 = 1;
        // if(n>0){
        //     n3 = n1+n2;
        //     n1 = n2;
        //     n2 = n3;
        //     System.out.print(n3+ " ");
        //     fib(n-1);
        // }
        
   }

    public static void main(String args[]) {
        // fib(5);/
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();


        // if (n == 2) {
        //     System.out.println("n is prime");
        // } else {
        //     boolean isPrime = true;
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }
        //     if (isPrime == true) {
        //         System.out.println("n is prime");
        //     } else {
        //         System.out.println("n is not prime");

        //     }
        // }
        int n= 10, n1 =0, n2 =1;
        System.out.println(" fibonacci till " +n + " term");

        for(int i = 0; i<n; i++){
            System.out.print(n1+" ");
            int n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
        }

    }
}
