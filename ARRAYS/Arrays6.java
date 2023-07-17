import java.util.*;
public class Arrays6 {
//Q3. 
   static 
//Q1. prefix array without using new array:
   static int[] makePreficSumArrayInplace(int[] arr){
    for(int i=1; i<arr.length; i++){
        arr[i] = arr[i-1] + arr[i];

    }
    return arr;
   }
// Q1. prefix sum using new array :
    static int[] makePreficSumArray(int[] arr){
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        int k=0;
        for(int i=1; i<arr.length; i++){
            pref[i] = pref[i-1] + arr[i];
        }

        return pref;
    }
    static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array :");
        int n = sc.nextInt();
        //array declaration :
        int[] arr = new int[n];
        //taking array input :
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Q1.
        // int[] pref = makePreficSumArray(arr);
        // printArr(pref);
        
        //Q1.b) 
        // int[] pref = makePreficSumArrayInplace(arr);
        // printArr(pref);
    }
    
}
