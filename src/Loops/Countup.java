package Loops;

import java.util.Scanner;

public class Countup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int val=scan.nextInt();
        for(int i=0;i<=val;i++){
            System.out.println(i);
        }
    }
}

