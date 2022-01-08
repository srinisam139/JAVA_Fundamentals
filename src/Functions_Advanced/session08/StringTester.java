package activties.session08;
import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String x = scan.next();
        System.out.println("Enter a String");
        String y =scan.next();
        System.out.println("Enter a String");
        String z  =scan.next();
        System.out.println("Comparing "+x+" and "+y+":"+(x==y));
        System.out.println("Comparing "+x+" and "+z+":"+(x==z));
        x = new String("Buttercup");
        y = new String("Buttercup");
        System.out.println("Comparing "+x+" and "+y+":"+(x==y));
    }
}
