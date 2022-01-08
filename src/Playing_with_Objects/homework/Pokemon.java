package Playing_with_Objects.homework;

import java.util.Scanner;
import java.util.Random;

public class Pokemon {
    private String name;
    private  String type;
    private int attack;
    private int health;
    public static int input=0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public Pokemon(){//Default constructor
        this.name="NORMAL POKEMON";
        this.type="NORMAL";
        this.attack=50;
        this.health=1000;
    }
    public Pokemon(String name,String type,int attack,int health){//Parameterized constructor
        this.name=name;
        this.type=type;
        this.attack =attack;
        this.health=health;
    }
    public String toString(){
        return "Name: "+getName()+"Type: "+getType()+"Attack: "+getAttack()+"Health: "+getAttack();
    }
    public int destroy(Pokemon[] pok) {//Creating a destroy method to fight between two Pokemon under pokemon class.
        Scanner scan = new Scanner(System.in);
        System.out.println("Whom do you want to destroy " + getName());
        for (int i=0; i<pok.length;i++) {
            System.out.println("Press "+i+" to destroy "+pok[i].getName());
        }
        input = scan.nextInt();
        if (pok[input].getName().equals(getName())) {
            System.out.println("You cannot destroy yourself crazy " + getName());
            destroy(pok);
        } else {
            if (getAttack() > pok[input].getHealth()){
                pok[input].setHealth(0);
            } else{
                pok[input].setHealth(pok[input].getHealth() - getAttack());

            }
        }
        return getAttack();
    }
    public boolean conscious(){
        return getHealth() == 0;
    }//Checking pokemon is alive or not.

    public static void main(String[] args) {
            int n;
            Random r=new Random();
            Scanner scan = new Scanner(System.in);
            Pokemon Norm = new Pokemon();
            //All the below objects are of Pokemon class.
            Pokemon Norm2 = new Pokemon("DUMP Pokemon", "NORMAL",50,600);
            Pokemon Ignite = new Pokemon("Torch", "FIRE",200,600);
            Pokemon Pure = new Pokemon("Purify", "WATER",200,600);
            Pokemon Earth = new Pokemon("EARTH", "GRASS",200,600);
            Pokemon[] test = {Norm, Norm2, Ignite, Pure, Earth};//Array of objects belongs to only pokemon class.
            //All the below objects are of all the other classes.
            Fire Burn = new Fire("PHOENIX", "FIRE", 200, 900);
            Water Aqua = new Water("AQUARIUS", "WATER", 150, 850);
            Water Splash = new Water("SPLASH", "WATER", 200, 850);
            Fire Flame = new Fire("ELDRAGO", "FIRE", 300, 900);
            Grass Green = new Grass("GREMISIS", "GRASS", 170, 1000);
            Grass Swamp = new Grass("SWAMPFIRE", "GRASS", 250,900);

            Pokemon[] F = {Norm, Norm2, Burn, Flame, Aqua, Splash, Green, Swamp};//Creating array of objects of all the other classes.
            System.out.println("Amount of damage done by " + Norm.getName() + " is " + Norm.destroy(test)+" health remaining for the "+test[input].getName()+" is "+test[input].getHealth());
            System.out.println("Amount of damage done by " + Norm2.getName() + " is " + Norm2.destroy(test)+" health remaining for the "+test[input].getName()+" is "+test[input].getHealth());
            System.out.println("Amount of damage done by " + Pure.getName() + " is " + Pure.destroy(test)+" health remaining for the "+test[input].getName()+" is "+test[input].getHealth());
            System.out.println("Amount of damage done by " + Earth.getName() + " is " + Earth.destroy(test)+" health remaining for the "+test[input].getName()+" is "+test[input].getHealth());
            System.out.println("Amount of damage done by " + Ignite.getName() + " is " + Ignite.destroy(test)+" health remaining for the "+test[input].getName()+" is "+test[input].getHealth());
            Norm.conscious();
            Pure.conscious();
            Earth.conscious();

            Arena a = new Arena();//Creating method for objects
            do{
                int index = r.nextInt(F.length);//Generating random number for selecting the type of the 1st pokemon
                int index2 = r.nextInt(F.length);//Generating random number for selecting the type of the 2nd pokemon
                F[index].setAttack((int) Math.floor(Math.random() * (100 - 50 + 1) + 50));//Generating a random number to set the attack for 1st pokemon
                F[index].setHealth((int) Math.floor(Math.random() * (1000 - 500 + 1) + 500));//Generating a random number to set the health for 1st pokemon
                F[index2].setAttack((int) Math.floor(Math.random() * (100 - 50 + 1) + 50));//Generating a random number to set the attack for 2nd pokemon
                F[index2].setHealth((int) Math.floor(Math.random() * (1000 - 500 + 1) + 500));//Generating a random number to set the health for 2nd pokemon
                a.fight(F[index], F[index2]);//Call is made to fight between two selected pokemons.
                System.out.println("Do you want to watch an another battle-\n" +
                                   " Press 1 to continue \n" +
                                   " Press 0 to quit");
                n =scan.nextInt();//Prompting for the user input to quit the match or not
            }while(n!=0);
        System.out.println("Adiós until Next time");
    }

}
