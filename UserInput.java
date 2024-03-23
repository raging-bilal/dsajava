package Array;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        int sum=0;
        System.out.println("Enter the length of the Array to Enter: ");
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the "+n+ " elements in the array!");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The output  of the array: ");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("\nThe sum of the elements of array is: "+sum);
        
        sc.close();
        
    }
    
}
