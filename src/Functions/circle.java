package Functions;

/**
 * The circle class is used to find the perimeter and area of the circle, and also it will check the whether a point lies inside the circle,
 * and it used the variables defined inside the point class.
 */
public class circle {
    point centre = new point();
    private double radius;

    public double getRadius() {//getters
        return radius;
    }

    public double setRadius(double radius) {//setters
        this.radius = radius;
        return this.radius;
    }

    public double perimeter(double radius){//To find Perimeter
        return 2*Math.PI*this.radius;
    }

    public double area(double ar){//To find Area
        ar= Math.PI*Math.pow(this.radius,2);
        return ar;
    }
    public boolean testAppartenance(double x, double y){//To check whether the point lies inside the circle or not
        centre.setAbscissa(x);
        centre.setOrdinate(y);
        if(centre.getAbscissa()<this.radius&&centre.getOrdinate()<this.radius){
            System.out.println("The Abscissa and ordinates belongs to the circle");
            return true;
        } else {
            System.out.println("The Abscissa and ordinates does not belongs to the circle");
            return false;
        }
    }
    public void display(double peri, double ar){//Display method to print the perimeter and area of the circle
        System.out.println("The Perimeter of the circle is: "+ peri);
        System.out.println("The Arae of the circle is: "+ ar);
    }
}
