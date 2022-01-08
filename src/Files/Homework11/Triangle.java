package Files.Homework11;

public class Triangle extends Shape {
    Position position;
    private double length;
    private String color;
    private String line_color;

    public double getLength() {
        return length;
    }

    /**
     *
     * @param length, This parameter gets the length of the triangle, when this function is called.
     * @throws CustomException, It will return if there is any exception(i.e any negative values).
     */
    void length(double length) throws CustomException{
        if(length<0){
            throw new CustomException("Please enter a positive number for length");
        } else {
            this.length=length;
            System.out.println("length is correct");
        }
    }

    /**
     *
     * @param length, It will return if there is any exception.(i.e any negative values)
     */
    public void setLength(double length) {
        try{
            length(length);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
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

    public static void main(String[] args) {
        Triangle T2 = new Triangle(new Position(5,5), 5.5, "Black","White");
        T2.setLength(-5);
    }
}
