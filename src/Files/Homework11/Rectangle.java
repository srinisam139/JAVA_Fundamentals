package Files.Homework11;

public class Rectangle extends Shape {
        private double width;
        private double height;
        private String color;
        private String line_color;
        Position position;
        public double getWidth () {
            return width;
        }

    /**
     *
     * @param width, This parameter gets the width of the rectangle, when this function is called.
     * @throws CustomException, It will return if there is any exception.(i.e any negative values)
     */
    void width(double width) throws CustomException{
        if(width<0){
            throw new CustomException("Please enter a positive number for Width");
        } else {
            this.width=width;

            System.out.println("Width is Positive");
        }
    }

    /**
     *
     * @param height, This parameter gets the height of the rectangle, when this function is called.
     * @throws CustomException, It will return if there is any exception.(i.e any negative values)
     */
    void height(double height) throws CustomException{
        if(height<0){
            throw new CustomException("Please enter a positive number for Height");
        } else {
            this.height=height;

            System.out.println("Height is Positive");
        }
    }

    /**
     *
     * @param width, gets the width from the user and sets the width if there is no exception
     */
        public void setWidth ( double width){
            try{
                width(width);
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }

        public double getHeight () {
            return height;
        }

    /**
     *
     * @param height, gets the height from the user and sets the height if there is no exception
     */
        public void setHeight ( double height){
            try{
                height(height);
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
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
    public void scale(double factor) {
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

    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(new Position(2,2), 4.5, 5.5, "blue","red");
        r2.setWidth(-5);
        System.out.println(r2.getWidth());
    }

}
