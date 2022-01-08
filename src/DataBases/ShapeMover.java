package DataBases;

public class ShapeMover {

    public static void move(Figure F, Position p){//Method to move the object
        F.move(p);
    }

    public static void scale(Figure F, double d){//Method to scale the object
        F.scale(d);
    }
    public static void main(String[] args) {


        Circle c1 = new Circle(new Position(5,0), "red", "blue", (float) 3.14);
        Rectangle r1 = new Rectangle(new Position(2,2), 4.5, 5.5, "blue","red");
        Triangle T1 = new Triangle(new Position(5,5), 5.5, "Black","White");
        System.out.println("This are the old position Playing_with_Objects.Interface.Circle value "+c1.getPos().getX()+c1.getPos().getY()+
                            "\nThis are the old position Triangle value"+T1.getPos().getX()+T1.getPos().getY()+
                            "\nThis are the old position Playing_with_Objects.Interface.Rectangle value"+r1.getPos().getX()+r1.getPos().getY()
                );
        move(T1,new Position(5,10));
        move(r1, new Position(4,4));
        move(c1, new Position(6,0));

        System.out.println("This is after creating the new position");
        System.out.println(T1);
        System.out.println(c1);
        System.out.println(r1);

        System.out.println("The below value is before scaling ");
        System.out.println(r1);
        System.out.println(T1);
        System.out.println("The below output is after scaling");
        scale(T1, T1.getLength());
        scale(r1, r1.getWidth());
        scale(r1, r1.getHeight());
        scale(c1, c1.getRadius());

        System.out.println(T1);
        System.out.println(r1);
        System.out.println(c1);
    }
}
