package RecursionAndBinarySearch.homework05;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers to get the multiplied value in recursion");
        int value = scan.nextInt();//getting first input from the user
        int value2 = scan.nextInt();// second input
        int result=call(value, value2);//Both the values are passed as an argument to the method
        System.out.println(value+" multiplied by "+value2+" is "+result);
    }

    /**
     * The method starts with the base case.
     * @param val1, This parameter acts as a base case and also runs another if case to take only positive values
     *              the val1 will keep on decreasing and the method will be called again and again
     *              till it reaches the base case. This parameter keep tracks of the length of the multiplication.
     * @param val2, This parameter stores the value to be multiplier.
     * @return, The return statement returns the final added value to the Graph.main function.
     */
    public static int call(int val1, int val2){
        if(val1==1){
            return val2;
        }
        else if(val1>0){

            int result=call(val1-1,val2);
            result = result+val2;
            return result;
        }else{
            return 0;
        }
    }

}
