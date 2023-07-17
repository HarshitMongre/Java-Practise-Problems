import java.util.*;
public class arrays4Practtise {
//Q3. check the given number is present or not for "q" query :
  static int[] makeFreqArr(int[] arr){
    int[] freq = new int[100005];
    for(int i=0; i<arr.length; i++){
        freq[arr[i]]++;
    }
    return freq;
  }
//Q2. 
static void rotateArrayInplace(int[] arr,int k){
    int n = arr.length;
    k = k%n;
    swapArray(arr, 0, n-k-1);
    swapArray(arr, n-k, n-1);
    swapArray(arr, 0, n-1);
  }
//Q2. rotate an array by 'k' steps, where k is non-mnegative:
   static int[] rotateArrayByK(int[] arr, int k){
    int n =arr.length;
    k = k % n;
    int [] ans = new int[n];
    int j=0;
    for(int i=n-k; i<n; i++){
        ans[j++] = arr[i];
    }
    for(int i=0; i<=n-k-1; i++){
        ans[j++] = arr[i];
    }
    return ans;
   }
//Q1. reverse array woithout creating array :
   static void swapArray(int [] arr, int i, int l){
    while(i<l){
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
    }
   }
   static void revrseArr(int [] arr){
    int n=arr.length;
     int i=0; 
     int l=n-1;
     while(i<l){
        swapArray(arr, i, l);
        i++;
        l--;
     }
   }
// Q1. reverse an array : (creating a new array)
   static int[] reverseArray(int[] arr){
    int n = arr.length;
    int ans[] = new int[n];
    int j=0;
    for(int i=n-1; i>=0; i--){
        ans[j++] = arr[i];
    }
    return ans;
   } 

   static void printArray(int [] arr){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // taking array input :
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Q1.
        // int [] ans = reverseArray(arr);
        // printArray(ans);

        //Q1.
        // revrseArr(arr);
        // printArray(arr);

        //Q2.
        // System.out.println("enter k : ");
        // int k = sc.nextInt();
        // int [] ans = rotateArrayByK(arr, k);
        // System.out.println("rotated array :");
        // printArray(ans);

        //Q2.
        // rotateArrayInplace(arr, k);
        // System.out.println("array after rotation ");
        // printArray(arr);

        //Q3.
        int [] freq = makeFreqArr(arr);
        System.out.println("enterno. of query  : ");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("enter number to be search : ");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
    
}
