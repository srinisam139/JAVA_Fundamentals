package RecursionAndBinarySearch.homework05;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be raised");
        int value = scan.nextInt();//getting first input from the user
        System.out.println("Enter the exponent");
        int value2 = scan.nextInt();// second input
        int result=call(value,value2);//Both the values are passed as an argument to the method
        System.out.println(value+" power of "+value2+" is "+result);
    }

    /**
     The method starts with the base case.
     * @param val1, This variable stores the value to be raised, and it will be passed as dummy again and again
     *              till val2 reaches the base case.
     * @param val2, This parameter acts as a base case and also runs another if case to take only positive values
     *      *              and the val2 will keep on decreasing and the method will be called again and again
     *      *              till it reaches the base case. This parameter keep tracks of the length of the exponent.
     * @return, The return statement returns the final raised value to the Graph.main function.
     */
    public static int call(int val1, int val2){
        if(val2==1){
            return val1;
        }
        else if(val2>0){
            int result = call(val1,val2-1);
            result=result*val1;
            return result;
        }else {
            return 0;
        }
    }
}
