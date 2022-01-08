package RecursionAndBinarySearch.homework05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to calculate the addition of n natural numbers using recursion");
        int value = scan.nextInt();//Getting input value from the user
        int result=call(value);//method is called and return value is stored in an integer
        System.out.println("The sum of N natural numbers using recursion is "+result);
    }

    /**
     * The below method gets a single input value
     *The base case is used to exit the recursion
     *Another 'if' case is used to accept only the positive values
     * Inside the 'if' case, the argument value is decreased and function is called again till it reaches the base case
     * Base case will return the value and the recursion will go backwards from where it started
     * and the final added value is returned to the Graph.main function.
     * */
    public static int call(int val1){
        if(val1==1){//base case
            return 1;
        } else if(val1>0){
            int result = call(val1-1);
            result = result+val1;
            return result;
        } else {
            return 0;
        }
    }
}
