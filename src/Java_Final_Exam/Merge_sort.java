package Java_Final_Exam;

import java.util.Random;
import java.util.Scanner;

public class Merge_sort {
    private static int[] arr;//declaring the global array
    private static final Random RNG = new Random();//Random object is created
    public static void mergeSort(int[] arr, int n){
        int count=1;
        if(n==1){// Base case
            return;
        }
        int mid=n/2;//Mid value
        int[] bfr = new int[mid];//Before mid
        int[] afr = new int[n-mid];//After mid

        for(int i=0;i<mid;i++){//Splitting the array into sub array
            bfr[i]= arr[i];
        }
        for(int i=mid;i<n;i++){//Splitting the array into sub array
            afr[i-mid]= arr[i];

        }

        mergeSort(bfr, bfr.length);//This goes to the left side of the array
        mergeSort(afr, afr.length);//This does the right side of the array

        Merge(arr, bfr, afr, mid, n-mid);// This Merges and sorts from down to up
}

    public static void Merge(int[] arr,int[] l, int[] r, int mid, int n){
        int i = 0, j = 0, k = 0;
        while (i < mid && j < n) {//This case is used to check the sizes for both the arrays
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                k+=1;
                i+=1;
            }
            else {
                arr[k] = r[j];
                k+=1;
                j+=1;
            }
        }
        while (i < mid) {//If right side of the array is completed, this case will work
            arr[k] = l[i];
            k+=1;
            i+=1;
        }
        while (j < n) {//If left side of the array is completed, this case will work
            arr[k] = r[j];
            k+=1;
            j+=1;
        }
    }

    public static int[] makeArray(int size) {//Array is generated randomly
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            arr[index] = RNG.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your size of the random array");
        int value = scan.nextInt();//Getting the size of an array
        arr = makeArray(value);//Calling the random generator
        System.out.println("Thr unsorted random array is");
        for (int j : arr) {
            System.out.print(j + " ");//Prints the unsorted array
        }
        mergeSort(arr, arr.length);//Calling the Merge dividing function
        System.out.println("\nThe sorted array is");
        for(int i : arr){// printing the sorted array
            System.out.print(i + " ");
        }
    }

    }

/**
 * LinkedList can be used here to insert the values because it involves O(1) Big 'O' notation in insertion compared to
 * arraylist.
 */
