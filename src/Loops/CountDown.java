package Loops;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        System.out.println("Enter a number to print the count");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        while(val>=0){
            System.out.println(val);
            val--;
        }
    }
}
