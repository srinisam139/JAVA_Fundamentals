package RecursionAndBinarySearch.homework05;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start=0;
        System.out.println("Enter a string to check palindrome or not using recursion");
        String name = scan.next();//getting input from the user to scan the value.
        int end=name.length()-1;//initializing the end value of the string
        boolean value = call(name, start, end);// calling the method
        System.out.println(value);
    }
    /*The below method gets three input from the Graph.main, first is the string value, second is the start
      value and the third is the end.
     */
    public static boolean call(String pal, int start, int end){
            char[] ch = new char[pal.length()];// Creating character array object with string length as the size
            boolean result=false;//initializing the return variable value at the method beginning
             ch[start]= pal.charAt(start);//Storing the index value from the string to character array in new index(Left to right)
             ch[end] = pal.charAt(end);//Storing the particular index value from the string to character array in new index(Right to left)
             if(start==end){//This is the base case
                 result= true;
             }
             else if(ch[start]==ch[end]){//Left and right index values are compared to check palindrome or not
                 result=call(pal, start+1, end-1);//calling the method to check again
                 return result;// passing the value to the same method
             }
             return result;//passing the final value to the Graph.main method
    }
}
