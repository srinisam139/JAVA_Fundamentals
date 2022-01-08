package Loops.homework04;

import java.util.Arrays;
import java.util.Scanner;

public class program03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] country = new String[5];// Array is created
        int[] population = new int[5];// Another array is created
        int average=0;//Average variable is initialized and created
        for(int i=0;i<population.length;i++){//This loop is used to get the user input for the two arrays
            System.out.println("Enter the "+(i+1)+call(i+1)+" country name and it's population");
            country[i] = scan.next();//Getting a string input
            population[i]=scan.nextInt();//getting a int input
        }
        for(int i=0;i<population.length;i++){//This loop prints the stored value in both the arrays
            System.out.println("The "+(i+1)+call(i+1)+" country name is "+country[i]+" and it's population is: "+population[i]);
            average=population[i]+average;
        }
        System.out.println("Average population of all the listed five countries are: "+average/5);//Prints the average value of the populaltion
    }
    public static String call(int call){//This function is used to check the number suffix while printing
        String nota = switch(call){
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            case 4,5 -> "th";
            default ->"";
        };
        return nota;
    }
}
