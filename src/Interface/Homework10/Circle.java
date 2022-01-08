package Interface.Homework10;

public class Circle extends Shape {//This is a circle class extending from shape
    private double radius;
    private String color;
    private String line_color;
    Position position;

   public Circle(Position p, String color, String line_color, double radius){//Constructor
        super(p, color, line_color);
        this.radius =radius;
        this.color=color;
        this.line_color=line_color;
        this.position=p;
   }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){ return radius;}

    @Override
    public Position getPos() {
       return position;
    }

    @Override
    public void move(Position p) {//Moves the x and y value to the new position
        position.setX(p.getX());
        position.setY(p.getY());
    }

    @Override
    public String getFillColor() {
        return this.color;
    }

    @Override
    public String getLineColor() {

       return line_color;
    }//Returns the line color

    public double area(){
       return (int) (Math.PI*radius*radius);
    }//calculate the area

    public double perimeter(){
       return 2 * Math.PI*radius;
    }//calculate the perimeter

    @Override
    public void scale(double factor) {
        setRadius(factor*factor);
    }//This is used to scale the radius value into double

    public String toString(){
        return  "Playing_with_Objects.Interface.Circle"+
                "\nX is: "+p.getX()+
                "\nY is: "+p.getY()+
                "\nArea of the Playing_with_Objects.Interface.Circle is : "+area()+
                "\nPerimeter of the Playing_with_Objects.Interface.Circle is: "+perimeter()+
                "\nRadius of the circle is: "+getRadius()+
                "\nFill color is: "+color+
                "\n Line color is: "+line_color;
   }


}