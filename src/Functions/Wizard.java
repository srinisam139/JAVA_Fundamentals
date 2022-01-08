package Functions;

public class Wizard {

    private String name;
    private int age;
    private String breed;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public int setAge(int age){
        this.age=age;
        return age;
    }
    public String toString(){
        return "Wizard[name "+name+" age is "+age+"]";
    }
    public Wizard(){
        this.name = "alapaegus";
        this.age = 21;

    }
    public Wizard(String breed){
        this.breed=breed;
        System.out.println(this.breed);
    }
    public Wizard(String name, int age) {
        this.name = name;
        this.age =age;
        System.out.println(" "+this.name+" "+this.age);
    }
    public void growth(int age){
        this.age = age+1;
        System.out.println("Happy birthday "+ name +" You turned "+ age + " years old");
        weight();
    }
    public void weight(){
        if(age>=11){
            this.weight=50;
        }
        System.out.println("The weight of the dog at age of "+ age +" should be "+this.weight);
    }

    public static void main(String[] args) {
        Wizard wiz1 = new Wizard("Chelsea",10);
        Wizard wiz2 = new Wizard("Bruno", 25);
        Wizard wiz3 = new Wizard("Reriever");
        wiz1.growth(10);
        System.out.println(wiz1);
        wiz3.setBreed("Rotwieler");
        System.out.println(wiz3.getBreed());
    }

}
