package Functions_Advanced;

import java.util.Objects;
import java.util.Scanner;

public class Telephone {

    Scanner scan = new Scanner(System.in);
    private String master;//This variable stores the Telephone number copies of the created objects
    private String mobile;//Mobile-Stores the respective unique phone number if the objects are created.
    private String landline;//Landline-Stores the respective unique phone number if the objects are created.
    private String satellite;//Satellite-Stores the respective unique phone number if the objects are created.
    private String red=null;//This variable is used to store the last redialled number in any of the called objects.
    private int flag = 1;//This variable controls whether the phone is busy or not.
    private String type;//This variable stores the type of the Telephone.
    String arr= "";//This is an empty String to store the dialled calls.
    int count=0;//This is an int variable count to store the count values of the object called.
    int n;//This variable is used to scan the index value of the phone number to be called.
    private String stop;
    private int j;

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getLandline() {
        return landline;
    }
    public void setLandline(String landline) {
        this.landline = landline;
    }
    public String getSatellite() {
        return satellite;
    }
    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }
    public String getMaster() {
        return master;
    }
    public void setMaster(String master) {
        this.master = master;
    }
    public String getType() {
        return type;
    }
    public String getStop() {
        return stop;
    }
    public void setStop(String stop) {
        this.stop = stop;
    }
    public String getRed() {
        return red;
    }
    public void setRed(String red) {
        this.red = red;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String toString(){//ToString method.
        return "The phone number for the "+ getType() +" is "+getMaster()+ "\nThe type of the "+ getType() +" phone is: "+getType()+"\n The recent call of the "+getType()+" is: "+getRed();
    }

    public Telephone(String type) {//This is parameterized constructor of one parameter
        this.master = "5550001";
        this.mobile = "5550001";
        this.type = type;
    }

    public Telephone(String master, String type) {//This is the parameterized constructor of two parameters.
        int result = Integer.parseInt(master);//Converting the String value to integer
        result += 1;//Result will be increment everytime the constructor is called.
        this.master = String.valueOf(result);//Stores the value to the master copy
        this.type=type;
    }
    public boolean equals(Object mobile2){//deep equality is used to compare if any phone number is equal or not.
        if(mobile2 instanceof Telephone){
            Telephone mob = (Telephone) mobile2;
            return true;
        } else {
            return false;
        }
    }

    public String call(Telephone[] call){//This is the calling method
        if(flag == 1){
        System.out.println("What number you want to call, ");
        for (int i = 0; i < call.length; i++) {
            System.out.println("press " + i + " to call this number " + call[i].getMaster());
        }

        n = scan.nextInt();}
        if (flag == 1 && call[n].getFlag()==1) {//This condition determines if the called object as well as the object number going to call is busy or not.
            if (getMaster().equals(call[n].getMaster())) {
                System.out.println("You are trying to call the same number: 101 Error");
            } else {
                call[n].setStop(this.master);
                setStop(this.master);
                this.count+=1;
                this.flag = 0;//This is to set the dialler busy
                call[n].setFlag(0);//This is to set the receiver busy.
                red=call[n].getMaster();//This variable stores the recent dialled call number.
                call[n].setStop(red);
                arr=red;//This variable is used to get all the dialled calls.
                System.out.println("Phone is starting a call to the following number " + call[n].getMaster());

            }
        } else {
            System.out.println("The phone is already in another call, please disconnect the call");
        }
        return arr;//The dialled calls are returned to the Graph.main and added to the arraylist.
    }
    public void disconnect(Telephone[] call) {//Disconnect method is used to disconnect the call.
        if (flag == 1)
            System.out.println("Call is not in progress, error: make a call to disconnect");
        else
            this.flag = 1;//This variable changes the busy settings to available for the caller.
            call[n].setFlag(1);//This value sets the busy to active for the receiver.
            for(int i=0;i< call.length;i++){
                if(Objects.equals(call[n].getStop(), call[i].getMaster())){
                    call[i].setFlag(1);
                }
            }
        System.out.println("The following caller number is disconnected: "+call[n].getStop()+"\nAs well as the following dialled number is disconnected: "+getStop());
    }
    public String recent(Telephone[] call){

        if(red!=null){//This loop calls the last dialled call in an object.
            System.out.println("Phone is trying to redial the number "+red);
            if (flag == 1 && call[n].getFlag()==1) {
                if (getMaster().equals(red)){
                    System.out.println("You are trying to call the same number: 404 Error");
                } else {
                    call[n].setStop(this.master);
                    setStop(this.master);
                    count+=1;
                    flag = 0;
                    call[n].setFlag(0);
                    arr=red;
                    System.out.println("Phone is starting a call to the following number " + red);
                }
            } else {
                System.out.println("The phone is already in another call, please disconnect the call");
            }
        } else {
            System.out.println("No call has been made so far: error");
        }
        return arr;//Returning the called value to the arraylist.
    }
    public int count(){
        return this.count;//All the dialled calls are counted and returned it to the Graph.main for every object.
    }
}
