package Functions.homework;

public class PhysicalElements {
    private String name;
    private String symbol;
    private int atomic_num;
    private double atomic_weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomic_num() {
        return atomic_num;
    }

    public void setAtomic_num(int atomic_num) {
        this.atomic_num = atomic_num;
    }

    public double getAtomic_weight() {
        return atomic_weight;
    }

    public void setAtomic_weight(double atomic_weight) {
        this.atomic_weight = atomic_weight;
    }
    public String toString(){//toString method is used to print the values depending upon the objects called.
        return "Element name is: "+getName()+"\nSymbol is:  "+getSymbol()+"\nAtomic number: "+getAtomic_num()+"\nAtomic_Weight is: "+getAtomic_weight();
    }

    /**
     *The below constructor is used to set all the values while creating the object.
     */
    public PhysicalElements(String name, String symbol, int atomic_num, double atomic_weight){
        setName(name);
        setSymbol(symbol);
        setAtomic_num(atomic_num);
        setAtomic_weight(atomic_weight);
    }

    public static void main(String[] args) {
        /**
         * The below values are objects of the physical elements class, 10 objects are created for 10 different elements.
         */
        PhysicalElements ele = new PhysicalElements("Hydrogen", "H",1, 1.008);
        PhysicalElements ele1 = new PhysicalElements("Helium", "He",2, 4.003);
        PhysicalElements ele2 = new PhysicalElements("Lithium", "Li",3, 6.941);
        PhysicalElements ele3 = new PhysicalElements("Beryllium", "Be",4, 9.012);
        PhysicalElements ele4 = new PhysicalElements("Boron", "B",5, 10.811);
        PhysicalElements ele5 = new PhysicalElements("Carbon", "C",6, 12.011);
        PhysicalElements ele6 = new PhysicalElements("Nitrogen", "N",7, 14.007);
        PhysicalElements ele7 = new PhysicalElements("Oxygen", "O",8, 15.999);
        PhysicalElements ele8 = new PhysicalElements("Fluorine", "F",9, 18.998);
        PhysicalElements ele9 = new PhysicalElements("Neon", "Ne",10, 20.180);
        /**
         * Below output function uses object to print the overwritten values from the toString method.
         */
        System.out.println(ele);
        System.out.println(ele1);
        System.out.println(ele2);
        System.out.println(ele3);
        System.out.println(ele4);
        System.out.println(ele5);
        System.out.println(ele6);
        System.out.println(ele7);
        System.out.println(ele8);
        System.out.println(ele9);

    }

}
