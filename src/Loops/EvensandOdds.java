package Loops;

import java.util.Scanner;

public class EvensandOdds {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int val;
        do{

            System.out.println("Enter a number: ");
            val = scan.nextInt();
            if(val%2==0){
                System.out.println("Even");
            } else{
                System.out.println("Odd");
            }
        }while(val!=0);

    }
}
