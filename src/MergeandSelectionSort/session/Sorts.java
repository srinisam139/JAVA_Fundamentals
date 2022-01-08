package MergeandSelectionSort.session;

import java.util.Random;
import java.util.Scanner;

public class Sorts {
    private static final Random RNG = new Random();

    public static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] select(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j=i+1; j<array.length;j++){
                if (array[i] >= array[j]) {
                    array = swap(array, i, j);
                }
            }
        }
        return array;
    }

    public static int[] swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }

    public static int[] makeArray(int size) {
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            arr[index] = RNG.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your size of the random array");
        int value = scan.nextInt();
        int[] array = makeArray(value);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Th random generated array is" + array[i]);
        }
        boolean res = sorted(array);
        if (res) {
            System.out.println("The random generated array is sorted  " + res);
        } else {
            array = select(array);
            System.out.println("The sorted array using selection sort is");
            for (int j : array) {
                System.out.println(j);
            }
        }
    }
}
