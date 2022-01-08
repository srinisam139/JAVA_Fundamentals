package Practicum_1;

import java.util.Scanner;
import java.util.Random;
public class RobotDemo {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        int iteration;
        boolean result;
        int j=0;
        Robot r1 =new Robot(0);
        Robot r2= new Robot(0,5,10,"East");
        Robot r3= new Robot(0,6,8,"East");
        RobotNG r4 = new RobotNG(0);
        RobotNG r5= new RobotNG(0);
        RobotNG r6= new RobotNG(0);
        System.out.println("Please give the ID for all the robots");
        r1.setId(scan.nextInt());
        r2.setId(scan.nextInt());
        r3.setId(scan.nextInt());
        r4.setId(scan.nextInt());
        r5.setId(scan.nextInt());
        r6.setId(scan.nextInt());
        do{
            result= true;
            System.out.println("Enter a input between the range 0 and 10");
            iteration=scan.nextInt();
            if(iteration>=0 && iteration<=10){
                result=false;
            }
        }while(result);
        String[] s = {"North","South","West","East"};
        for(int i=0;i<iteration;i++){
            j=ran.nextInt(3);
            r1.advance(s[j]);
            r2.advance(s[j]);
            r3.advance(s[j]);
            r2.advance(s[j]);
            r1.advance(s[j]);
            r4.advance(s[j]);
            r5.advance(s[j]);
            r5.advance(s[j]);
            r6.advance(s[j]);
            r6.advance(s[j]);
        }
        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
        r6.display();

    }

}
