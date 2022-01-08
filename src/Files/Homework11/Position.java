package Files.Homework11;

public class Position {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Position(double x, double y){//Playing_with_Objects.Interface.Position class to store all the values
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "X is "+getX()+"\nY is "+getY();
    }

    public boolean equals(Object y){
        if(y instanceof Position p2) {
            return this.x == p2.x && this.y==p2.y;
        }
        return false;
    }
}
