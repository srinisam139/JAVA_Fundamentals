package Functions.homework;
import java.util.Scanner;

public class Thermometer {
    private float celsius;
    private float fahrenheit;
    private float kelvin;
    private final char uni = '\u00B0';//unicode of degree.

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

    public float getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }
    public Thermometer(){
        this.celsius=37;
    }

    /**
     *
     *@param celsius, When celsius method is called, the fahrenheit and kelvin values are converted from celsius and
     * setter method is used to set the values.
     */
    public void celsius(float celsius){
        setCelsius(celsius);
        setFahrenheit((getCelsius()*9/5)+32);
        setKelvin((float) (getCelsius()+273.15));
    }

    /**
     *
     * @param fahrenheit, When fahrenheit method is called, the celsius and kelvin values are converted from fahrenheit and
     * setter method is used to set the values.
     */
    public void fahrenheit(float fahrenheit){
        setFahrenheit(fahrenheit);
        setCelsius((getFahrenheit()-32)*5/9);
        setKelvin((float)((getFahrenheit()-32)*5.0/9.0+273.15));
    }

    /**
     *
     * @param kelvin, When kelvin method is called, the fahrenheit and celsius values are converted from levin and
     * setter method is used to set the values.
     */
    public void kelvin(float kelvin){
        setKelvin(kelvin);
        setCelsius((float) (getKelvin()-273.15));
        setFahrenheit((float) ((getKelvin()-273.15)*9/5+32));
    }

    /**
     *
     * @return, the below method is used to return all the values in the specified format to the Graph.main function
     */
    public String toString(){
        return "The Celsius value is: "+getCelsius()+uni+"C"+"\nThe fahrenheit value is: "+getFahrenheit()+uni+"F"+"\nThe Kelvin value is: "+getKelvin()+"K";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Thermometer ther = new Thermometer();//Object is created for the thermometer class
        System.out.println("Enter a positive value in celsius");
        ther.celsius(scan.nextFloat());//getting the input from the user in celsius(positive) to convert into fahrenheit and kelvin
        System.out.println(ther);//toString method is invoked using the object name
        System.out.println("Enter a negative value in celsius");
        ther.celsius(scan.nextFloat());//getting the input from the user in celsius(negative) to convert into fahrenheit and kelvin
        System.out.println(ther);//toString method is invoked using the object name
        System.out.println("Enter a negative value in fahrenheit");
        ther.fahrenheit(scan.nextFloat());//getting the input from the user in fahrenheit(negative) to convert into celsius and kelvin
        System.out.println(ther);//toString method is invoked using the object name
        System.out.println("Enter a positive value in kelvin");
        ther.kelvin(scan.nextFloat());//getting the input from the user in kelvin(positive) to convert into fahrenheit and kelvin
        System.out.println(ther);//toString method is invoked using the object name
    }
}
