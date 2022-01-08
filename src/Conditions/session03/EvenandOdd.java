package Conditions.session03;

import java.util.Scanner;

//The followig code is to use to test even or Odd using conditonal operator If.
public class EvenandOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int val = scan.nextInt();// This will scan the value and store it in variable val
        call(val);// Function is called
    }

    public static void call(int value) {
        //Value is received from the function parameter value and if condition is tested
        if (value % 2 == 0) {
            System.out.println("The number is even");
        } else if(value%5==0){
            System.out.println("The number is divisible by 5");//else if condition is tested for divisibility of 5
        } else {
            System.out.println("The number is odd");// else will be printed if both the condition above or false
        }
    }
}
