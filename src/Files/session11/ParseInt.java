package Files.session11;

public class ParseInt {
    public static void main(String[] args) {
        String s ="Sam";
        int n;
        try{

            n =Integer.parseInt(s);

        } catch(NumberFormatException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
