public class PetNames {
    public static void main(String[] args) {
        pet();
        pet();
    }
    public static void pet(){
        String name = "Buttercup";
        for (int i =0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
