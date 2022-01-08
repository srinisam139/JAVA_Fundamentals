package Expressions.Activities;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float x=scan.nextFloat();
        float y=scan.nextFloat();

        System.out.println("X ="+x+" Y ="+y);
        call((float)x,(float)y);

        x=scan.nextFloat();
        y=scan.nextFloat();
        System.out.println("X = "+x+" Y = "+y);
        call((float)x,(float)y);
        x=scan.nextFloat();
        y=scan.nextFloat();
        System.out.println("X = "+x+" Y = "+y);
        call((float)x,(float)y);
    }
    public static void call(float x,float y){
        System.out.println("x + y ="+(x+y));
        System.out.println("x * y ="+(x*y));
        System.out.println("x - y ="+(x-y));
        System.out.println("x / y ="+(x/y));
    }
}
