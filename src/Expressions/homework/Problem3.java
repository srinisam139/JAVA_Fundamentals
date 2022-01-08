package homework;
import java.util.Scanner;
import java.util.ArrayList;
public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String val1 = scan.nextLine();
        System.out.println("Enter a Float value");
        float val2 = scan.nextFloat();
        System.out.println("Enter a character");
        char val3= scan.next().charAt(0);
        String result=call(val1,val2,val3);
        System.out.println(result);
    }
    public static String call(String s,float f, char c){
        return "The Concatenated string is "+s+" "+f+" "+c;
    }
}
