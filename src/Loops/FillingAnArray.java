package Loops;

import java.util.Scanner;

public class FillingAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int val=scan.nextInt();
        int[] save;
        save = call(val);
        for(int i: save){
            System.out.println(i);
        }
    }
    public static int[] call(int arr){
        int[] val;
        val = new int[arr];
        for (int i = 0; i < val.length; i++) {
            val[i]=i*10;
        }
        return val;
    }
}

