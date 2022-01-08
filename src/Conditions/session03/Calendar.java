package Conditions.session03;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int val = scan.nextInt();
        String result = call(val);
        System.out.println("It is the "+val+result);
    }
    public static String call(int val){
        String days = switch (val) {
            case 1, 21,31 -> "st";
            case 2,22 -> "nd";
            case 3,23 -> "rd";
            default -> "th";
        };
        return days;
    }
}
