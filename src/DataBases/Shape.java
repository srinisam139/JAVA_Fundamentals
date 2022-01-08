package DataBases;

/**
 * @Shape Class, This is the shape class of abstract type, which is a parent class.
 */

public abstract class Shape implements Figure {

        Position p;
        private String color;
        private String line_Color;

        public Shape(Position p, String color, String line_color) {
            this.p = p;
            this.color = color;
            this.line_Color = line_color;
        }


        public String toString () {
            return p.getX() + p.getY() + "" + color + "" + line_Color;
        }

}
