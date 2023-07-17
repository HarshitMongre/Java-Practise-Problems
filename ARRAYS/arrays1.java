import java.util.*;
public class arrays1 {
    //Q3. search an element and return it's index no. else return -1 :
    static int  searchElementInArray(int arr[], int search){
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                index = i;
            }
        }
        return index;
    }
    //Q2. find max value in an array :
    static int maxOfArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }
    //Q1. print the sum of ALL ELEMENTS present in an Array :
    static int sumOfArrayElements(int[] arr){
        int sum =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    // helper method to PRINT OUTPUT :
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the size of array : ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       // array input taking :
       for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
       }
    //    System.out.println("array is : ");
    //    printArray(arr);
//Q1.
    // int sum = sumOfArrayElements(arr);
    // System.out.println(sum);
//Q2.
    //    int max = maxOfArray(arr);
    //    System.out.println("max element of an array is :");
    //    System.out.println(max);
//Q3.    
          System.out.println("search an element : ");
          int search = sc.nextInt();
          int searching = searchElementInArray(arr, search);
          System.out.print("element found at  index " + " ");
          System.out.println(searching);

    }
}
