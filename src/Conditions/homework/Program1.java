package Conditions.homework;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = scan.nextInt();//Getting input from the user
        if(age<10){//Going through the nested if else condition to identify the statement under the persons age.
            System.out.println("is this your first program?");
        } else if(age<13){
            System.out.println("A tween!");
        } else if(age<20){
            System.out.println("A teen!");
        } else if(age<30){
            System.out.println("A twenty-something!");
        } else{
            System.out.println("With age comes experience.");
        }
    }// end of nested if else condition
}// end of Graph.main
