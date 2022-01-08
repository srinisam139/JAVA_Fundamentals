package Playing_with_Objects.homework;

import java.util.Scanner;

public class Grass extends Pokemon{
    int value;
    public Grass(String name, String type, int attack, int health) {
        super(name,type,attack,health);
    }

    public int destroy(Pokemon[] pok) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whom do you want to destroy " + getName());
        for (int i = 0; i < pok.length; i++) {

            System.out.println("Press " + i + " to destroy " + pok[i].getName());
        }
        input = scan.nextInt();//Giving the input in form of index value to choose the pokemon for battle.
        if (pok[input].getName().equals(getName())) {
            System.out.println("You cannot destroy yourself dump " + getName());
            destroy(pok);//calling again the method to fight with some other pokemon.
        } else {
            switch (pok[input].getType()) {//Switch cases to check the type of the pokemon and reduce the health accordingly.
                case "NORMAL", "GRASS" -> {
                    if (getAttack() > pok[input].getHealth()){
                        pok[input].setHealth(0);
                        return getAttack();
                    } else{
                        pok[input].setHealth(pok[input].getHealth() - getAttack());
                        value = getAttack();
                    }
                }
                case "FIRE" -> {
                    if (2*getAttack() > pok[input].getHealth()){
                        pok[input].setHealth(0);
                        return 2*getAttack();
                    } else{
                        pok[input].setHealth(pok[input].getHealth() - (getAttack()*2));
                        value = getAttack()*2;
                    }
                }
                case "WATER" -> {
                    if (getAttack()/2 > pok[input].getHealth()){
                        pok[input].setHealth(0);
                        return getAttack();
                    } else{
                        pok[input].setHealth(pok[input].getHealth() - (getAttack()/2));
                        value = getAttack()/2;
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + pok[input].getType());

            }
        }
        return value;
    }
}
