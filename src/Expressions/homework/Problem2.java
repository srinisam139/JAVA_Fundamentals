package homework;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mass in gram");
        double m= scan.nextDouble();
        double  val= gram(m);
        System.out.println("Energy = "+val+" joules of Energy");
    }
    public static double gram(double m) {
        double c = 299792458; // m/s(Metre per Second)
        return m*(c*c);
    }
}
