package Files.session11;

public class ParseIntMultiple {
    public static void main(String[] args) {
        String s ="Sam";
        int n;
        try{

            n =Integer.parseInt(s);

        } catch(NumberFormatException e) {
            System.out.println("1");
            e.getMessage();
            e.printStackTrace();
        } catch(IllegalArgumentException e) {
            System.out.println("2");
            e.getMessage();
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("2");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
