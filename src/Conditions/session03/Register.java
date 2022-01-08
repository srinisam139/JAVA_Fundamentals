package Conditions.session03;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the charge");
        float val = scan.nextFloat();
        System.out.println("Enter the payment");
        float val2 = scan.nextFloat();
        String result=call(val,val2);
        System.out.println(result);
    }
    public static String call(float change, float payment){
        float result;
        String fin;
        result = change - payment;
        result=-(result);
        int integer= (int)result;
        float decimal = Math.round(((10*result-10*integer)/10)*100);
        int split = (int)decimal;
        if(integer==1&&split==1){
            fin = "Your change is "+integer+" dollar and "+split+" cent";
        } else if(split==1){
            fin="Your change is "+integer+" dollars and "+split+" cent";
        } else if(integer==1){
            fin="Your change is "+integer+" dollar and "+split+" cents";
        } else{
            fin="Your change is "+integer+" dollars and "+split+" cents";
        }
        return fin;
    }
}
