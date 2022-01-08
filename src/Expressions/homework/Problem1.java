package Expressions.homework;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in Fahrenheit to convert into Kelvin");
        double x=scan.nextDouble();
        double K = call(x);
        System.out.println(x+" degrees Fahrenheit is "+K);
    }
    public static double call(double F){

        return ((5.0/9.0)*(F-32))+273;
    }
}
