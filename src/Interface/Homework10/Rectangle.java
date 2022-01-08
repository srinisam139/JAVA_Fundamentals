package Interface.Homework10;

public class Rectangle extends Shape {
        private double width;
        private double height;
        private String color;
        private String line_color;
        Position position;
        public double getWidth () {
            return width;
        }

        public void setWidth ( double width){
            this.width = width;
        }

        public double getHeight () {
            return height;
        }

        public void setHeight ( double height){
            this.height = height;
        }

    public Rectangle(Position p, double width, double height, String color, String line_color){//This is a constructor
            super(p, color, line_color);
            this.width = width;
            this.height = height;
            this.color=color;
            this.line_color=line_color;
            this.position=p;
        }

    @Override
    public Position getPos() {
        return null;
    }

    @Override
    public void move(Position p) {
        position.setX(p.getX());
        position.setY(p.getY());
        }

    @Override
    public String getFillColor() {
        return this.color;
    }

    @Override
    public String getLineColor() {
            return this.line_color;
    }

    public double area () {
            return (int)width * height;
        }

    public double perimeter () {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public void scale(double factor) {//This method is used to scale the value
            if(factor==getWidth()){
                setWidth(factor*factor);
            } else {
                setHeight(factor*factor);
            }

    }

    public String toString () {
            return  "Playing_with_Objects.Interface.Rectangle "+
                    "\nArea: "+area()+
                    "\nPerimeter: "+perimeter()+
                    "\nx is: " + p.getX() +
                    "\ny is: " + p.getY() +
                    "\nWidth is: "+getWidth()+
                    "\nHeight is: "+getHeight()+
                    "\ncolor is: " + getFillColor() +
                    "\nline_color is: " + getLineColor();
        }
        public boolean equals (Object B){
            Rectangle H = (Rectangle) B;
            return H.getWidth() == this.width && H.getHeight() == this.height;
        }

}
