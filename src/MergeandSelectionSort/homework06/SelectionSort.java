package MergeandSelectionSort.homework06;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort{
    private static final Random RNG = new Random();//Creating a random object

    public static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] select(int[] array){//The following function aligns the array value in ascending order
        for (int i = 0; i < array.length - 1; i++) {
            for(int j=i+1; j<array.length;j++){
                if (array[i] <= array[j]) {
                    array = swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static int[] swap(int[] arr, int a, int b) {//This function is used to swap the values
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }

    public static int[] makeArray(int size) {//generating random array
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            arr[index] = RNG.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your size of the random array");
        int value = scan.nextInt();//taking the size of the random array
        int[] array = makeArray(value);//calling the function and storing the array value
        System.out.println("The random generated array before Sorting is");
        for (int k : array) {
            System.out.print(k + " ");//printing the random generated array before sorting
        }
        boolean res = sorted(array);//calling the function to sort the array
        if (res) {
            System.out.println("The random generated array is sorted ");
            System.out.println(res);
        } else {
            array = select(array);//This function stores the sorted array values
            System.out.println();
            System.out.println("The random generated array after sorting is ");
            for (int j : array) {
                System.out.print(j+" ");//prints the sorted array
            }
        }
    }
}
