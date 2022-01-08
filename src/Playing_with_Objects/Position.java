package Playing_with_Objects;

public class Position {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Position(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "X is "+getX()+"\nY is "+getY();
    }

    public boolean equals(Object y){
        if(y instanceof Position) {
            Position p2 = (Position) y;
            return this.x == p2.x && this.y==p2.y;
        }
        return false;
    }

    public static void main(String[] args) {
        Position P1 = new Position(5,10);
        System.out.println(P1);
        Position P2 = new Position(5,10);
        System.out.println(P1.equals(P2));

    }
}
