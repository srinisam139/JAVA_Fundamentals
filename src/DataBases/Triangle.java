package DataBases;

public class Triangle extends Shape {
    Position position;
    private double length;
    private String color;
    private String line_color;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {//Constructors
        return "Triangle"+
                "\nposition of X is: "+ position.getX()+
                "\nPlaying_with_Objects.Interface.Position of Y is: " + position.getY()+
                "\nLength is: " + getLength()+
                "\n Area is: "+area()+
                "\n Perimeter is: "+perimeter()+
                "\nFill color is: "+ color+
                "\nLine color is: "+line_color;
    }

    public Triangle(Position p, double length, String color, String line_color) {//This is the constructor
        super(p, color, line_color);
        this.length = length;
        this.position = p;
        this.color=color;
        this.line_color=line_color;
    }

    @Override
    public Position getPos() {
        return position;
    }

    @Override
    public void move(Position p) {
        position.setX(p.getX());
        position.setY(p.getY());
    }

    @Override
    public String getFillColor() {
        return color;
    }

    @Override
    public String getLineColor() {
        return line_color;
    }

    public double area() {
        return (int) ((0.5) * length * (length / 2));
    }

    @Override
    public double perimeter() {
        return 3*length;
    }

    /**
     *
     * @param , this method will get the objects and compare it to the other object whether it is overlapping or not
     * @return It will return boolean value if it is true.
     */
    @Override
    public boolean overlaps(Shape s) {
        if (s instanceof Circle) {
            double dissq = (position.getX() - s.getPos().getX()) * (position.getX() - s.getPos().getX()) + (position.getY() - s.getPos().getY() * (position.getY() - s.getPos().getY()));
            double radSumSq = (getLength() * ((Circle) s).getRadius());
            return dissq < radSumSq;
        } else if (s instanceof Rectangle) {
            double radSumSq = getLength() * getLength();
            double dissq1 = (((s.getPos().getX() - position.getX()) * (s.getPos().getX() - position.getX())) + (position.getY() * position.getY()));
            double dissq2 = ((position.getX() * position.getX()) + ((s.getPos().getY() - position.getY()) * (s.getPos().getY() - position.getY())));
            double dissq3 = ((position.getX() * position.getX()) + (position.getY() * position.getY()));
            double dissq4 = (((s.getPos().getX() - position.getX()) * (s.getPos().getX() - position.getX())) + ((s.getPos().getY() - position.getY()) * (s.getPos().getY() - position.getY())));
            if (dissq1 < radSumSq) {
                return true;
            } else if (dissq2 < radSumSq) {
                return true;
            } else if (dissq3 < radSumSq) {
                return true;
            } else return dissq4 < radSumSq;
        } else if(s instanceof Triangle){
            double dissq = (position.getX() - s.getPos().getX()) * (position.getX() - s.getPos().getX()) + (position.getY() - s.getPos().getY() * (position.getY() - s.getPos().getY()));
            double radSumSq = (getLength() * ((Triangle) s).getLength());
            return dissq < radSumSq;
        } else{
            return false;
        }
    }

    @Override
    public void scale(double factor) {
        setLength(factor * factor);
    }

    public double Perimeter() {
        return (float) length * 3;
    }

    public boolean equals(Object a) {//Equals method to check all the values
        Triangle t = (Triangle) a;
        return t.getLength() == this.length;
    }
}
