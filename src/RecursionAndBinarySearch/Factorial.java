package RecursionAndBinarySearch;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = call(n);
        System.out.println(val);
    }
    public static int call(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            int value = n * call(n-1);
            return value;
        }
    }
}
