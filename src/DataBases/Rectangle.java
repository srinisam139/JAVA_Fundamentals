package DataBases;

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
            return position;
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

    /**
     *
     * @param , this method will get the objects and compare it to the other object whether it is overlapping or not
     * @return It will return boolean value if it is true.
     */
    @Override
    public boolean overlaps(Shape s) {
        if(s instanceof Circle){
            double radSumSq=((Circle) s).getRadius()*((Circle) s).getRadius();
            double dissq1=(((s.getPos().getX()-position.getX())*(s.getPos().getX()-position.getX()))+(s.getPos().getY()*s.getPos().getY()));
            double dissq2=((s.getPos().getX()*s.getPos().getX())+((s.getPos().getY()- position.getY())*(s.getPos().getY()- position.getY())));
            double dissq3=((s.getPos().getX()* s.getPos().getX())+(s.getPos().getY()* s.getPos().getY()));
            double dissq4=(((s.getPos().getX()- position.getX())*(s.getPos().getX()- position.getX()))+((s.getPos().getY()- position.getY())*(s.getPos().getY()- position.getY())));
            if(dissq1<radSumSq) {
                return true;
            }else if(dissq2<radSumSq){
                return true;
            } else if(dissq3<radSumSq){
                return true;
            } else return dissq4 < radSumSq;
        } else if(s instanceof Rectangle){
            if(0>=s.getPos().getX() || s.getPos().getX()>=position.getX()){
                return false;
            } else if(0>=s.getPos().getY()||0>=s.getPos().getX()){
                return false;
            } else {
                return true;
            }
        } else if(s instanceof Triangle){
            double radSumSq=((Triangle)s).getLength()*((Triangle) s).getLength();
            double dissq1=(((s.getPos().getX()-position.getX())*(s.getPos().getX()-position.getX()))+(s.getPos().getY()*s.getPos().getY()));
            double dissq2=((s.getPos().getX()*s.getPos().getX())+((s.getPos().getY()- position.getY())*(s.getPos().getY()- position.getY())));
            double dissq3=((s.getPos().getX()* s.getPos().getX())+(s.getPos().getY()* s.getPos().getY()));
            double dissq4=(((s.getPos().getX()- position.getX())*(s.getPos().getX()- position.getX()))+((s.getPos().getY()- position.getY())*(s.getPos().getY()- position.getY())));
            if(dissq1<radSumSq) {
                return true;
            }else if(dissq2<radSumSq){
                return true;
            } else if(dissq3<radSumSq){
                return true;
            } else return dissq4 < radSumSq;
        }
        return false;
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
