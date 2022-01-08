package Functions.homework;
import java.util.Random;
import java.util.Scanner;

public class Quicksort {
    private static final Random RNG = new Random();
    public static void quicksort(int[] array, int low, int high) {
        int i = low, j = high;

        int pivot = array[low];

        System.out.print("Chosen pivot: "+pivot+" ");


        while (i <= j) {
            // If the current value from the left list is larger than the pivot
            // element then get the next element from the left list
            while (array[i] > pivot) {
                i++;
            }
            // If the current value from the right list is smaller than the pivot
            // element then get the next element from the right list
            while (array[j] < pivot) {
                j--;
            }

            // If we have found a value in the left list which is smaller than
            // the pivot element and if we have found a value in the right list
            // which is Larger than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and decrease j
            if (i <= j) {
                exchange(array, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        System.out.print("with left values: ");
        for (int k = low; k <= j; k++)
            System.out.print(array[k] + " ");

        System.out.print("and right values: ");
        for (int k = i; k <= high; k++)
            System.out.print(array[k] + " ");

        System.out.print("\n");

        if (low < j)
            quicksort(array, low, j);
        if (i < high)
            quicksort(array, i, high);
    }

    private static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int[] makeArray(int size) {//generating random array
        int[] arr = new int[size];
        for (int index = 0; index < size; index++) {
            arr[index] = RNG.nextInt();
        }
        return arr;
    }

    /** A test method */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your size of the random array");
        int value = scan.nextInt();
        int[] arr = makeArray(value);
        for (int k : arr) {
            System.out.print(k + " ");//printing the random generated array before sorting
        }
        System.out.println("\n");
        System.out.print("Before sorting: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");

        quicksort(arr,0, arr.length - 1);//Printing the random generated array after sorting
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
