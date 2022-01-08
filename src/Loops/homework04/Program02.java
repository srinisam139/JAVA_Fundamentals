package Loops.homework04;

public class Program02 {
    public static void main(String[] args) {
        int i;
        for(i=0;i<=1000;){//This loop runs till 1000
            if(i!=1000){//This condition is used to prevent printing ',' at the last statement
                System.out.print(i+", ");// prints the value of the variable 'i' currently holds.
                i=i+10;//Increase the value of 'i' by 10
            } else{
                System.out.print(i);//prints the last value of i
                i=i+1;//This statement is used o stop the loop from running
            }
        }
    }
}
