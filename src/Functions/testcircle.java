package Functions;
import java.util.Scanner;

public class testcircle {//This class is the Graph.main class
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        circle round = new circle();//object is created for the circle class
        System.out.println("Enter a radius for the circle");
        double n = scan.nextDouble();//getting input from the user for the radius
        round.setRadius(n);//declaring the radius to the circle class using the setter method
        double val1=round.perimeter(round.getRadius());//calling the method
        double val2=round.area(round.getRadius());//calling the method
        round.display(val1,val2);//desplay method is called
        System.out.println("Enter the X and Y co-ordinates");//getting the coordinates from the user to check whether it lies inside the circle or not
        double co1= scan.nextDouble();
        double co2=scan.nextDouble();
        System.out.println("The Abscissa belongs to the circle or not: "+round.testAppartenance(co1,co2));
    }
}
