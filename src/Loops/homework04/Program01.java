package Loops.homework04;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String check;
        do{
            System.out.println("Enter two numbers");
            int val1 = scan.nextInt();//User needs to give the first value
            System.out.println("Enter the second number");
            int val2 = scan.nextInt();//User needs to give the second value
            System.out.println("The added value is "+(val1+val2));//This statement adds the user input and displays the result
            System.out.println("Do you want to perform the operation again--Type Yes or No");
            check = scan.next();
        }while("Yes".equalsIgnoreCase(check));//This condition checks for the user input and reiterate the loop if it is true

    }
}
