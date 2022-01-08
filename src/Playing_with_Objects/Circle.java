package Playing_with_Objects;

public class Circle extends Shape {
    private float radius;
    private float area;
    private float perimeter;

   public Circle(Position p, String color, String line_color, float radius){
        super(p, color, line_color);
        this.radius =radius;
   }

    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public float getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius(){ return radius;}

    public float area(){
        setArea((float) (Math.PI*radius*radius));
        return (float) (Math.PI*radius*radius);
    }

    public float perimeter(){
        setPerimeter((float) (2 * Math.PI*radius));
       return (float) (2 * Math.PI*radius);
    }
    public String toString(){
        return "Area of the Playing_with_Objects.Interface.Circle is : "+p.getX()+"\nPerimeter of the Playing_with_Objects.Interface.Circle is: "+p.getY();
    }

    public static void main(String[] args) {
       Position p = new Position(3,4);
        Circle c = new Circle(p, "red","green", (float) 5.6);
        System.out.println(c);
        System.out.println(c.getArea()+c.getPerimeter());

    }
}