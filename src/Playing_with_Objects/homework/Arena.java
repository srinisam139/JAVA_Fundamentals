package Playing_with_Objects.homework;

import java.sql.SQLOutput;

public class Arena extends Pokemon {
    public Arena(){}
    public void fight(Pokemon Obj1, Pokemon Obj2){
        Pokemon[] entry ={Obj1, Obj2};
        for(int i =0; i<entry.length;i++){
            System.out.print("Name: "+entry[i].getName());
            System.out.print(" Type: "+entry[i].getType());
            System.out.print(" Attack: "+entry[i].getAttack());
            System.out.print(" Health: "+entry[i].getHealth());
            System.out.println("");
        }
        do{
            //Obj1 attacks the Obj2 Pokemon
            if(Obj1.getAttack()>=Obj2.getHealth()){
                Obj2.setHealth(0);
                System.out.println(Obj2.getName()+" is knocked out by "+Obj1.getName());
                System.out.println("Damage done by "+Obj1.getName()+" to "+Obj2.getName()+" is "+Obj1.getAttack()+"\n Health remaining for the "+Obj2.getName()+" is "+Obj2.getHealth());
            } else {
                Obj2.setHealth(Obj2.getHealth()-Obj1.getAttack());
                System.out.println("Damage done by "+Obj1.getName()+" to "+Obj2.getName()+" is "+Obj1.getAttack()+"\n Health remaining for the "+Obj2.getName()+" is "+Obj2.getHealth());
            }
            if(Obj2.getHealth()==0){
                break;
            } else if(Obj2.getAttack()>=Obj1.getHealth()){
                Obj2.setHealth(0);
                System.out.println("Damage done by "+Obj2.getName()+" to "+Obj1.getName()+" is "+Obj2.getAttack()+"\n Health remaining for the "+Obj1.getName()+" is "+Obj1.getHealth());
            } else{
                Obj1.setHealth(Obj1.getHealth()-Obj2.getAttack());
                System.out.println("Damage done by "+Obj2.getName()+" to "+Obj1.getName()+" is "+Obj2.getAttack()+"\n Health remaining for the "+Obj1.getName()+" is "+Obj1.getHealth());
            }
        }while(Obj1.getHealth()!=0||Obj2.getHealth()!=0);
    }
}
