package Interface.Homework10;

import java.util.Scanner;
import java.util.Random;

public class ShapeArray {

    public static Shape[] sortShape(Shape[] arr) {//This method will sort the shape according to the value of area

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].area() > arr[j].area()) {
                    Shape temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static boolean compareObjects(Shape shape1, Shape shape2) {//This method is used to compareObjects state as well as their class
        if (shape1 instanceof Triangle t1 && shape2 instanceof Triangle t2) {
            System.out.println("Tri");
            return t1.getLength() == t2.getLength()&&t1.getFillColor() == t2.getFillColor()&&t1.getLineColor()==t2.getFillColor();
        } else if (shape1 instanceof Circle c1 && shape2 instanceof Circle c2) {
            System.out.println("Cir");
            return c1.getRadius() == c2.getRadius() && c1.getFillColor() == c2.getFillColor() && c1.getLineColor() == c2.getLineColor();
        } else if (shape1 instanceof Rectangle r1 && shape2 instanceof Rectangle r2) {
            System.out.println("Rec");
            return r1.getHeight()== r2.getHeight()&&r1.getWidth()==r2.getHeight()&&r1.getFillColor()==r2.getFillColor()&&r1.getLineColor()==r2.getLineColor();
        }
        return false;
    }

    public static boolean findShape(Shape[] arr, Shape obj) {//This method is used to compare the objects and return true or not
        for (Shape shape : arr) {
            if (compareObjects(obj, shape)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Random ran = new Random();//Random object is created
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the array size between 2 and 20");
        int n = scan.nextInt();//input from the user is received
        Shape[] arr = new Shape[n];
        String[] color = {"red", "Purple", "Orange", "Green", "Yellow", "White", "violet"};//Fill Color is stored in an array.
        String[] line_col = {"red", "Purple", "Orange", "Green", "Yellow", "White", "violet", "black"};//Line color is stored in an array.
        for (int i = 0; i < n; i++) {
            int ob = ran.nextInt(2);
            int ch = ran.nextInt(6);//String color
            int lnc = ran.nextInt(7);//String Line color
            int len = ran.nextInt(100);//Length of the triangle
            Position p = new Position(ran.nextInt(100), ran.nextInt(100));//Creating the value for position
            int rad = ran.nextInt(50);//Radius
            int width = ran.nextInt(20);// Width
            int height = ran.nextInt(40);//Height
            switch (ob) {//Switch case is created to generate random objects
                case 0 -> arr[i] = new Triangle(p, len, color[ch], line_col[lnc]);
                case 1 -> arr[i] = new Circle(p, color[ch], line_col[lnc], rad);
                case 2 -> arr[i] = new Rectangle(p, width, height, color[ch], line_col[lnc]);
            }
            System.out.println(arr[i]);//Printing the random objects
        }
        System.out.println("*****************************************Calling Sorting****************************************************");
        sortShape(arr);//Calling the sorting method
        for (Shape s : arr) {
            System.out.println(s);//Printing the values again after sorting
        }

        Triangle t1 = new Triangle(new Position(5,6), 5, "Black", "White");

        System.out.println("Array and an user created object is called"+findShape(arr, t1));

        System.out.println("Array and the first cell of the index is called"+findShape(arr, arr[0]));
    }
}
