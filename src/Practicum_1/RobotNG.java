package Practicum_1;

public class RobotNG extends Robot {

    public RobotNG(int Id) {
        super(Id);
    }

    public void advance(String direction){
        switch(direction){
            case "North":
                setY(getY()+2);
            case "East":
                setX(getX()+2);
            case "West":
                setX(getX()-2);
            case "South":
                setY(getY()-2);
        }
    }
    public void display(){
        System.out.println("Id of the Practicum.RobotNG: "+getId()+"\nCoordinate of the robot is: "+"("+getX()+","+getY()+")"+"\n Direction of the robot is: "+getDirection());
    }
}
