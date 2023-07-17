import java.util.*;
public class arr2 {
    // """THIS SECTION IS ALL ABOUT COPY METHODS - SHALLOW COPY AND DEEP COPY : """"
    //Method to print array elements :
    static void printArray(int [] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("SIZE OF ARRAY :");
        // int n = sc.nextInt();
        int arr[] = {1,2,3,4,5};
        int arr2[] = arr;   // SHALLOW COPY --> we are copying reference addresss not the memory

        System.out.println("original array : ");
        printArray(arr);
        System.out.println();
        System.out.println("copied array : ");
        printArray(arr2);
        System.out.println();
        arr2[0] = 34;
        arr2[1] = 54;
        System.out.println("original array : ");
        printArray(arr);
        System.out.println();
        System.out.println("copied array : ");
        printArray(arr2);

        int arr3[] = arr.clone(); // Deep Copy (method.1)
        arr3[0] = 1000;
        arr3[2] = 2000;
        System.out.println("original array : ");
        printArray(arr);
        System.out.println("copied array arr3 : ");
        printArray(arr3);
        System.out.println();

        int arr4[] = Arrays.copyOfRange(arr3, 0, arr3.length);
        printArray(arr4);
    }

}
