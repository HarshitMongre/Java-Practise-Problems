import java.util.*;
public class Arrays5 {
    //Q3. given an array in non-decreasing order; return the squere of each number sorted in non-decreasing order:
    static void reverse(int [] arr){
        int i=0, j=arr.length-1;
       while(i<j){
        swapElement(arr, i, j);
        i++;
        j--;
       }
    } 
    static int[] sortSquares(int[] arr){
        int l = 0, r =arr.length-1;
        int k=0;
        int [] ans = new int[arr.length];
        while(l<=r){
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                ans[k++] = arr[l] * arr[l];
                l++;
            }
            else{
                ans[k++] = arr[r]*arr[r];
                r--;
            }
        }

        return ans;
    }
    //Q2. sort an array such that even nu. should be placed at starting followed by odd number :
    static void sortArrayParity(int [] arr){
        int n = arr.length;
        int l=0; 
        int r = n-1;
        while(l<r){
            if(arr[l]%2!=0 && arr[r]%2==0){
                swapElement(arr, l, r);
                l++;
                r--;
            }
            if(arr[l]%2==0){
                l++;
            }
            if(arr[r]%2!=0){
                r--;
            }
        }
    }
    //Q1. sort an array consisting of only 0s and 1s:
    static void swapElement(int arr[], int l, int r){    
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static void sortBinaryArray(int [] arr){
        int n = arr.length;
        int l=0, r =n-1;
        while(l<r){
            if(arr[l]==1 && arr[r]==0){
                swapElement(arr, l, r);
                l++;
                r--;
            }
            if(arr[l]==0){
                l++;
            }
            if(arr[r]==1){
                r--;
            }
        }
    }
    static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String [] args){
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
        // sortBinaryArray(arr);
        // printArr(arr);


        // Q2.
        // sortArrayParity(arr);
        // printArr(arr);

        //Q3. 
        System.out.println("original array :");
        printArr(arr);
        System.out.println();
        int [] ans = sortSquares(arr);
        System.out.println("sorted array of squares: ");
        reverse(ans);
        printArr(ans);
    }

    
}
