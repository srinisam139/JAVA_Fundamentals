package Playing_with_Objects;

public class Shape {
    Position p;
    private String color;
    private String line_Color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLine_Color() {
        return line_Color;
    }

    public void setLine_Color(String line_Color) {
        this.line_Color = line_Color;
    }

    public Shape(Position p, String color, String line_color) {
        this.p =p;
        this.color = color;
        this.color = line_color;
    }

    public float area() {
        return 0;
    }

    public float Perimeter() {
        return 0;
    }

    public void move(float x, float y){
        p.setX(y);
        p.setY(x);
    }

    public float getArea() {
        return 1.0f;
    }

}
