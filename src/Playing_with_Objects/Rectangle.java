package Playing_with_Objects;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(Position p, float height, float width, String color, String line_color){
        super(p, color, line_color);
        this.width=width;
        this.height=height;
    }
    public float area(){
        return width*height;
    }
    public float Perimeter(){
        return 2*(getWidth()+getHeight());
    }
    public String toString(){
        return "x="+p.getX()+
                "y ="+p.getY()+
                "color ="+ getColor()+
                "line_color ="+getLine_Color();
    }
    public boolean equals( Object B){
        Rectangle H = (Rectangle)B;
        return H.getWidth()==this.width&&H.getHeight()==this.height;
    }

    public static void main(String[] args) {
        Position p = new Position(4,9);
        Rectangle r1 = new Rectangle(p, (float)3.4,(float)5.4,"blue","red");
        System.out.println(r1.area());
        System.out.println(r1.Perimeter());

    }

}
