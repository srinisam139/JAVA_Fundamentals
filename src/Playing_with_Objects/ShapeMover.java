package Playing_with_Objects;

public class ShapeMover {

    public static void moveShape(Shape s, Position p){
        System.out.println(s.toString());
        s.move(p.getX(),p.getY());
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        Position p = new Position(2,3);
        Shape c1 = new Circle(p, "red", "blue", (float) 3.14);
        c1.getArea();
        Circle c2 = new Circle(p, "red", "blue", (float) 3.14);
        Rectangle r1 = new Rectangle(p, (float) 4.5, (float) 5.5, "blue","red");

        moveShape(c1, new Position(7,5));
    }
}
