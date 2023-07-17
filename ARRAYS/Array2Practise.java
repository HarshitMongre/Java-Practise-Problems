import java.util.*;
public class Array2Practise {
//Q6. find Kth smallest & Kth largest elements:
  static int[] kthSmallestandLargest(int [] arr, int k){
    Arrays.sort(arr);
    int n = arr.length;
    int [] newArr = {arr[k-1],arr[n-k]};
    return newArr;
  } 
//Q5. return the  lowest and largest elements in an array :
   static int[] LastElements(int [] arr){
    Arrays.sort(arr);
    int [] newArr = {arr[0], arr[arr.length-1]};
    return newArr;
   }
//Q4. check if AN ARRAY IS SORTED OR NOT?
   static void isSorted(int arr[]){
    boolean isSorted = true;
    for(int i=1; i<arr.length; i++){
       if( arr[i] < arr[i-1]){
        isSorted = false;
       }
    }
    if(isSorted == false){
        System.out.println("array is not sorted");
    }
    else{
        System.out.println("array is sorted.");
    }
   }
//Q3. count the number of element strictly greater than x :
 static int checkGreaterOrNot(int [] arr, int x){
    int count =0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] > x){
            count++;
        }
    }
    return count;
 }
// Q2. find the last occurance of an element :
static int lastOccuranceOfElement(int[] arr, int x){
    int index = -1;
    for(int i=0; i<arr.length; i++){
        if(arr[i] == x){
            index = i;
        }
    }
    return index;
} 
//Q1. count the number of occurance of a particular element x.
    static int occuranceOfElement(int[] arr, int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    } 
    // aking array input :
    static void inputArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    // printing array elemets:
    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr);
        // printArray(arr);

//Q1.   
        // System.out.println(" findElement: ");
        // int n1 = sc.nextInt();
        // int occuranceCount =   occuranceOfElement(arr, n1);
        // System.out.println("occurance of " + n1 + " is " + occuranceCount);
//Q2.
        
    //     int lastIndex = lastOccuranceOfElement(arr, n1);
    //     System.out.println("last occurance of " + n1 + "is at index : " +lastIndex);

//Q3.   
//    System.out.println();
//     int checkGreater = checkGreaterOrNot(arr, n1);
//     System.out.println(checkGreater + " elements are greater than " + n1);

//Q4. 
    //   isSorted(arr);
//Q5.
    //   int [] arrNew =  LastElements(arr);
    //   System.out.println("smallest : " + arrNew[0]);
    //   System.out.println("Largest : " + arrNew[1]);

//Q6.  
      
      System.out.println("enter kth element : ");
      int k = sc.nextInt();
      int arrNew[] = kthSmallestandLargest(arr, k); 
       System.out.println("Kth smallest : " + arrNew[0]);
       System.out.println("Kth Largest : " + arrNew[1]);
}
}
