package Practicum_2;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
    static ArrayList<Integer> list = new ArrayList<>();
    private static int input;
    public static void integers() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integers to store in an array list");
        int digit;
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }
        for(int i=0;i<5;i++){
            try {
                digit = Integer.compare(i,5);
            } catch (InputMismatchException e) {
                list.set(i,10);
                list.get(i);
                e.getCause();
            }
        }

    }
    public static void zeroError(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 4; i >= 0; i--) {
            try{
                if(true){
                    System.out.println("no Error"+input/i);
                }
            } catch(IllegalArgumentException e){
                e.getCause();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        integers();
           // zeroError();
    }
}
