package Practicum_1;

public class Robot {
    private int Id;
    private int x;
    private int y;
    private String direction;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Robot(int Id){
        this.Id=Id;
        this.x=0;
        this.y=0;
        this.direction="East";
    }
    public Robot(int Id, int x, int y, String direction){
        this.Id=Id;
        this.x=0;
        this.y=0;
        this.direction=direction;
    }
    public void advance(String direction){
        switch(direction){
            case "North":
                this.y=this.y+1;
            case "East":
                this.x=this.x+1;
            case "West":
                this.x=this.x-1;
            case "South":
                this.y=this.y-1;
        }
    }
    public void display(){
        System.out.println("Id of the robot: "+getId()+"\nCoordinate of the robot is: "+"("+getX()+","+getY()+")"+"\n Direction of the robot is: "+getDirection());
    }
}
