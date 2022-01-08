package activties.session08;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String vin;
    private static int car_count=0;

    public Car(String make, String model, int year, String color, String vin){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.vin=vin;
        setCar_count(getCar_count()+1);
    }

    public static int getCar_count() {
        return car_count;
    }

    public static void setCar_count(int car_count) {
        Car.car_count = car_count;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String toString(){
        return "make is: "+getMake()+"\nmodel is: "+getModel()+"\nyear is: "+getYear()+"\ncolor is: "+getColor()+"\n vin is: "+vin;
    }
    public boolean equals(Object c,Object c2) {
        if (c instanceof Car && c2 instanceof Car) {
            Car car = (Car) c;
            Car car2 = (Car) c2;
            return (car.make == car2.make)&&(car.model==car2.model)&&(car.vin==car2.vin);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(getCar_count());
        Car c = new Car("Dodge","Dart",2013,"red","1234ABCD5");
        Car c2 = new Car("Dodge","Dart",2013,"red","1234ABCD5");
        Car c3 = new Car("Audi","R8",2021,"black","123456789");
        System.out.println("Both the same classes are compared here "+ c.equals(c,c2));
        System.out.println("Both the same classes are compared here "+ c.equals(c,c3));
        System.out.println(getCar_count());
    }
}
