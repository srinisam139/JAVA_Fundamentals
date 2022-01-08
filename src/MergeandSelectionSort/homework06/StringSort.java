package MergeandSelectionSort.homework06;

import java.util.Scanner;

public class StringSort {
    private static int[] population = new int[5];//Global variable to keep track of the population
    public static String call(int call){//This function is used to check the number suffix while printing
        return switch(call){
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            case 4,5 -> "th";
            default ->"";
        };
    }
    public static String[] divide(String[] cou, int[] pop, int n) {//This function is used to arrange the array alphabetically
        char[] c = new char[20];
        int[] a = new int[n];
        for(int i =0;i<cou.length;i++){
            c[i] = cou[i].charAt(0);
            a[i] = (int)c[i];
        }
        for (int i = 0; i < n-1; i++) {//Selection sort is used here
            for(int j=i+1; j<n;j++){
                if (a[i] > a[j]){
                    int temp = a[j];//This is the swapping algorithm for the Ascii values
                    a[j]=a[i];
                    a[i]=temp;
                    int temp2= pop[j];//This is swapping algorithm for population of the country
                    pop[j] = pop[i];
                    pop[i] = temp2;
                    cou = swap(cou, i , j);
                }
            }
        }
        return cou;
    }
    public static String[] swap(String[] arr, int a, int b) {//This is the swapping algorithm for the Countries
        String temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] country = new String[5];// Array is created
        // Another array is created
        int average=0;//Average variable is initialized and created
        for(int i=0;i<population.length;i++){//This loop is used to get the user input for the two arrays
            System.out.println("Enter the "+(i+1)+call(i+1)+" country name and it's population");
            country[i] = scan.next();//Getting a string input
            population[i]=scan.nextInt();//getting an int input
        }
        country=divide(country, population, country.length);//This is the calling function to arrange the strings
        for(int i=0;i<population.length;i++){//This loop prints the stored value in both the arrays
            System.out.println("The "+(i+1)+call(i+1)+" country name is "+country[i]+" and it's population is: "+population[i]);
            average=population[i]+average;
        }
        System.out.println("Average population of all the listed five countries are: "+average/5);//Prints the average value of the population
    }
}
