package Files.Homework11;

/**
 * This interface is created for the Playing_with_Objects.Interface.Shape classes and subclasses to use from here.
 */
public interface Figure {
    Position getPos();
    void move(Position p);
    String getFillColor();
    String getLineColor();
    double area();
    double perimeter();
    void scale(double factor);
}
