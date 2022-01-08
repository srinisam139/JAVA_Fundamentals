package Conditions.session03;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int val = scan.nextInt();
        String result = call(val);
        System.out.println(result);
    }
    public static String call(int val){
        String days = switch (val) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + val);
        };
        return days;
    }
}
