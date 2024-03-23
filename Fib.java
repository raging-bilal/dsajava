package Factorial;
/* 
Loops vs Recursion
To show the difference between loops and recursion, we will implement solutions to find Fibonacci numbers in three different ways:
*/

// An implementation of the Fibonacci algorithm above using a for loop.
// public class Fib{
//     public static void main(String args[]){
//         int a=0;
//         int b=1;
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         for(int i=1;i<=18;i++){
//             int temp=a+b;
//             a=b;
//             b=temp;
//             System.out.print(temp+" ");
//         }
//     }
// }


// An implementation of the Fibonacci algorithm above using recursion.
// public class Fib{
//     static int count=2;
//     public static void fib(int a, int b){
//         if(count<=19){
//             int temp=a+b;
//             System.out.print(temp+" ");
//             a=b;
//             b=temp;
//             count++;
//             fib(a, b);
//         }
//         else{
//             return;
//         }
//     }
//     public static void main(String args[]){
//         System.out.print(0+" ");
//         System.out.print(1+" ");
//         fib(0,1);
//     }
// }



// Finding the nth Fibonacci number using recursion.

public class Fib{
    public static int F(int n){
        if(n<=1){
            return n;
        }
        else{
            return F(n-1) + F(n-2);
        }
    }
    public static void main(String args[]){
        System.out.println(F(10));
    }
}
