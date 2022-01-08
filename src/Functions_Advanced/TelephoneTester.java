package Functions_Advanced;

import java.util.ArrayList;
import java.util.Collections;

public class TelephoneTester {

    public static void main(String[] args) {
        Telephone mob = new Telephone("Mobile");//oObject 1 mobile
        Telephone lan = new Telephone(mob.getMaster(), "Landline");
        lan.setLandline(lan.getLandline());//Object 2 Landline
        Telephone sat = new Telephone(lan.getMaster(), "Satellite");
        sat.setSatellite(lan.getSatellite());//Object 3 Satellite
        Telephone mob2 = new Telephone(sat.getMaster(),"Mobile");
        mob2.setMobile(sat.getSatellite());//Object 4 Mobile-2

        ArrayList<String> arr = new ArrayList<>();//Creating an Arraylist to store the array values.
        Telephone[] mas= {mob, lan, sat, mob2};// The created object values are used to call the methods.
        int count=0;//Initializing count variable to store the dialled calls count of all the object.

        arr.add(mob.call(mas));//Calling the method call with Object mob and the counts is added if a call is dialled.
        arr.add(lan.call(mas));//Calling the method call with Object lan and the counts is added if a call is dialled
        mob.disconnect(mas);//It will disconnect the Landline call as well as for the receiver.
        arr.add(mob.recent(mas));//It will redial the disconnected call previously by Landline and the counts is added if a call is dialled
        arr.add(mob2.call(mas));//Calling the method call with Object lan and the count is added if a call is dialled
        arr.add(sat.call(mas));//Calling the method call with Object sat and the count is added if a call is dialled
        System.out.println(mob);//Calling toString method to print the object mobile value
        System.out.println(lan);//Calling the toString method to print the object Landline value


        Collections.reverse(arr);//The collection framework reverses the vales stored in the arraylist.
        System.out.println("recent dialled calls are: ");
        for (String value : arr) {// This foreach loop will print all the values stored in the arraylist.
            System.out.print(" "+value);
        }
        System.out.println("\n"+mob.equals(mob2));//This method compares if both the object values are equal.
        for(Telephone a: mas){//This for store all the dialled calls of every object in the variable count.
            count=count+a.getCount();
        }
        System.out.println("\nCount is: "+count);
    }
}
