import java.util.*;
public class arrays3 {
//Q5. find very first nu. which is repeating :
  static int firstRepeatingValue(int arr[]){
    int n = arr.length;
    int repeatingNum = -1;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] == arr[j]){
                repeatingNum = arr[i];
                return repeatingNum;
            }
        }
    }
    return -1;
  }
//Q4. find second max. element :
static int maxElement(int[] arr){
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}
static int secondMaxElement(int [] arr){
    int max = maxElement(arr);
    for(int i=0; i<arr.length; i++){
        if(arr[i] == max){
            arr[i] = Integer.MIN_VALUE;
        }
      }
      int secondMax = maxElement(arr);

    return secondMax;
}
//Q3. find unique no. out of array where every no. is repeated twice except one number:
   static int uniqueNumberReturn(int[] arr){
    int n=arr.length;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] == arr[j]){
                arr[i] = -1;
                arr[j] = -1;
            }
        }
    }
    for(int i=0; i<n; i++){
        if(arr[i] >= 0){
         return arr[i];
        } 
     }
    return -1;
   }
//Q2. triplet sum :
   static int tripletSum(int[] arr, int target){
    int n = arr.length;
    int count =0 ;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            for(int k=j+1; k<n; k++){
                if(arr[i] + arr[j] + arr[k] == target){
                    count++;
                }
            }
        }
    }
    return count;
   }
//Q1. find total no. of pairs in the array whose sum is equal to given value x:
    static int targetSum(int [] arr, int target){
        int n = arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("size of the array : " );
        int n = sc.nextInt();
        int[] arr = new int[n];
        // TAKING ARRAY INPUT :
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // System.out.println("enter target value : ");
        // int target = sc.nextInt(); 
        // int targetSum = targetSum(arr, target);
        // System.out.println(targetSum);

        //Q2.
        // int tripletSum = tripletSum(arr, target);
        // System.out.println(tripletSum);
  
        //Q3. 
        // int uniqueNumber = uniqueNumberReturn(arr);
        // System.out.println(uniqueNumber);

        //Q4.
        // System.out.println("largest element: ");
        // int maxElement = maxElement(arr);
        // System.out.println(maxElement);
        // System.out.println("second largets element : ");
        // int secondMaxElement = secondMaxElement(arr);
        // System.out.println(secondMaxElement);

        //Q5.
        int firstRepeatNo = firstRepeatingValue(arr);
        System.out.println(firstRepeatNo);
    }
}
