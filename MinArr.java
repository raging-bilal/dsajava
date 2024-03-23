package Array;
// Algorithm: Find The Lowest Value in an Array

public class MinArr {
    public static void main(String[] args) {
        int arr[]={23,3,45,675,18,1,32,67,43,2};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];  
            }
        }
        System.out.println("The minimum value in the array: " + min);      
    }
}
