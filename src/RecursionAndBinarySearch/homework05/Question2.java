package RecursionAndBinarySearch.homework05;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an number to print upside down in recursion");
        int value = scan.nextInt();//Getting the first input from the user.
        sign(value);//method is called
    }
    public static void sign(int n){
        if(n>0) {//base case
            System.out.println("No Parking");//This output will print till the base case is failed.
            sign(n-1);//decreasing the argument value till it reaches the base case.
        }
    }
}
