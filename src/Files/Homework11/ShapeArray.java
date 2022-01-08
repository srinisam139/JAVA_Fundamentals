package Files.Homework11;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class ShapeArray {

    /**
     *
     * @param arr, This parameter has the objects and their state in form of array.
     * @throws IOException, This exception will be triggered if there is no file is existing or improper data is
     * given by the user.
     */
    public static void saveShapesToFile(Shape[] arr) throws IOException {
        File file = new File("Playing_with_Objects.Interface.Shape.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != null) {
                if (arr[i] instanceof Circle) {
                    pw.println("Playing_with_Objects.Interface.Circle" +
                            "\nX is: " + arr[i].p.getX() +
                            "\nY is: " + arr[i].p.getY() +
                            "\nArea of the Playing_with_Objects.Interface.Circle is : " + arr[i].area() +
                            "\nPerimeter of the Playing_with_Objects.Interface.Circle is: " + arr[i].perimeter() +
                            "\nRadius of the circle is: " + ((Circle) arr[i]).getRadius() +
                            "\nFill color is: " + arr[i].getFillColor() +
                            "\n Line color is: " + arr[i].getLineColor());
                } else if (arr[i] instanceof Rectangle) {
                    pw.println("Playing_with_Objects.Interface.Rectangle" +
                            "\nX is: " + arr[i].p.getX() +
                            "\nY is: " + arr[i].p.getY() +
                            "\nArea of the Playing_with_Objects.Interface.Circle is : " + arr[i].area() +
                            "\nPerimeter of the Playing_with_Objects.Interface.Circle is: " + arr[i].perimeter() +
                            "\nWidth of the circle is: " + ((Rectangle) arr[i]).getWidth() +
                            "\nHeight of the circle is: " + ((Rectangle) arr[i]).getHeight() +
                            "\nFill color is: " + arr[i].getFillColor() +
                            "\n Line color is: " + arr[i].getLineColor());
                } else if (arr[i] instanceof Triangle) {
                    pw.println("Playing_with_Objects.Interface.Rectangle" +
                            "\nX is: " + arr[i].p.getX() +
                            "\nY is: " + arr[i].p.getY() +
                            "\nArea of the Playing_with_Objects.Interface.Circle is : " + arr[i].area() +
                            "\nPerimeter of the Playing_with_Objects.Interface.Circle is: " + arr[i].perimeter() +
                            "\nWidth of the circle is: " + ((Triangle) arr[i]).getLength() +
                            "\nFill color is: " + arr[i].getFillColor() +
                            "\n Line color is: " + arr[i].getLineColor());
                } else {
                    System.out.println("There object name is undefined");
                }
                i++;
            }
        }
        fw.close();
        pw.close();
    }

    /**
     *
     * @param name, This parameter gets the name of the file needs to be read from the user.
     * @return, This will return an array copied from the file line by line for every index.
     * @throws IOException- This exception will be triggered if there is no file is existing or improper data
     * is given by the user.
     */
    public static String[] loadShapesToFile(String name) throws IOException {

        FileReader read = new FileReader(name);
        BufferedReader reader = new BufferedReader(read);

        String[] arr = new String[50];

        String check = reader.readLine();
        int i = 0;
        try {
            while (check != null) {
                check = reader.readLine();
                arr[i++] = check;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "There is an exception");
            e.printStackTrace();
        }
        reader.close();
        read.close();
        return arr;
    }

    public static void main(String[] args) throws IOException {
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

        try {
            saveShapesToFile(arr);//Function is called
            loadShapesToFile("Playing_with_Objects.Interface.Shape.txt");//Another function is called
        } catch (IOException e) {
            throw new IOException("There is no file to write");
        }
        System.out.println("******************The Object values copied from files are*******************");
        for(Shape s:arr){
            System.out.println(s);
        }
        System.exit(0);
    }
}

