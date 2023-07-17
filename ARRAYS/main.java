import java.util.*;
class main{
    // using 2-pointer method :


    //Problem 3: Given an integer array ‘a’ sorted in non-decreasing order, return an array of the squares of each
// number sorted in non-decreasing order.

static int[] sortSquereOfArray(int[] arr){
    int n = arr.length;
    int ans[] = new int[n];
    int j=n-1;
    int l=0, r=n-1;
    while(l<=r){
        if(Math.abs(arr[l]) > Math.abs(arr[r])){
            ans[j--] = arr[l] * arr[l];
            l++;
        }
        else{
            ans[j--] = arr[r] * arr[r];
            r--;
        }
    }
    return ans;
}
    //Problem 2: Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
// all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies
// the condition.

   static void sortParoty(int arr[]){
    int l=0, r=arr.length-1;
    while(l<r){
        if((arr[l]%2==1) && (arr[r]%2==0)){
            reverse(arr, l, r);
            l++;
            r--;
        }
        else if(arr[l]%2==0){
            l++;
        }
        else if(arr[r]%2==1){
            r--;
        }
    }
   }






    //(Problem 1: Sort an Array consisting of only 0s and 1s.)

    static void arraySortOfZandO(int arr[]){
        int l=0, r=arr.length-1;
        while(l<r){
            if(arr[l]==1 && arr[r] ==0){
                reverse(arr, l, r);
                l++;
                r--;
            }
            else if(arr[l] == 0){
                l++;
            }
            else if(arr[r] == 1){
                r--;
            }
        }
    }

    //method (member function) to print the array element taken by USER:
    static void printArray(int[] arr){

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    //REVERSE of an array : without using a new array -
    static void reverse(int[] arr,int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static void arrayReverse(int[] arr){
        int n =arr.length;
        int l=0;
        int r = n-1;
        while(l<r){
            reverse(arr, l, r);
            l++;
            r--;
        }

    }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter array size : ");
    // int size = sc.nextInt();
    // //initialize an array :
    // int[] arr = new int[size];
    // //taking array input from user:
    // for(int i=0; i<size; i++){
    //     arr[i] = sc.nextInt();
    // }
    // System.out.println("array is : ");
    // arrayReverse(arr);
    // printArray(arr);

    //q1 --> 
    // int[] arr = {1,0,0,1,1,0,1,0};
    // System.out.println("array before sorting : ");
    // printArray(arr);
    // System.out.println("array after sorting : ");
    // arraySortOfZandO(arr);
    // printArray(arr);

    //q2:
    // int arr[] = {5,7,9,3,1,2,4,6,8,0};
    // System.out.println("array before sorting : ");
    // printArray(arr);
    // System.out.println();
    // System.out.println("array after sorting : ");
    // sortParoty(arr);
    // printArray(arr);

    //Q3 : 
    int arr[] = {-3,2,4,8};
    int ans[] = sortSquereOfArray(arr);
    printArray(ans);


   } 
}