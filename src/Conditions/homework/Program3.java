package homework;
import java.util.Scanner;
import java.util.Random;//importing random to use random generator in our program.
public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();// Random object is instantiated
        boolean fin;
        int val = rand.nextInt(10);//we are using rand from the random to generate a random number with the limit upto 10
        System.out.println("Enter a number to guess");
        int user=scan.nextInt();// It is used to get an integer input from the user for the first guess
        boolean result=call(val,user);// Calls first time

        if (result){//'If' condition is left blank if the condition is true, and it will exit the program.
        } else{
            System.out.println("Enter an another number to guess");//Second guess
            user = scan.nextInt();
            fin = call(val,user);//second call
            System.out.println(fin);// printing the boolean result "true" or "false".
            if(fin){//Checking true or false again

            }else{// if it is false, goes into the else condition
                System.out.println("Enter an another number to guess");//third guess
                user = scan.nextInt();
                fin = call(val,user);//third call
                System.out.println(fin);//printing the third boolean output
            }
        }
    }
    public static boolean call(int rand, int guess){// Function starts from here
        boolean flag;// This is used to store the input depending upon the comparison below
        if(guess>rand){// the following code is used to check if the guess is matching with the random number.
            System.out.println("Too hignumber.h!");
            flag = false;
        } else if(guess<rand){
            System.out.println("Too low!");
            flag= false;
        } else{
            System.out.println("Correct");
            flag = true;
        }
        return flag;//returns the outcome to the Graph.main function
    }

}
