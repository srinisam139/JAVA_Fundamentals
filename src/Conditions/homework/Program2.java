
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int movies;
        System.out.println("Enter '1' if you want music or '2' if you want movies");
        choice = scan.nextInt();//This statement is used to select music or movies depending upon the input from the user
        if(choice==1){
            System.out.println("You have selected music");
            System.out.println("Do you like Dua Lipa music?, type 'Yes' or 'No'");
            String music = scan.next();//This statement is used to get the user input for the mentioned band
            if("Yes".equalsIgnoreCase(music)){//'If' condition is used to verify the user input for the band
                System.out.println("Good taste!");
            } else {
                System.out.println("There is no accounting for taste!");
            }
        } else {
            System.out.println("which Star Wars episode was the best");//If they selected choice as 2, it will move to movies
            movies = scan.nextInt();
            String days = switch (movies) {//switch case is used to select the statement from the user input
                case 4, 5 -> "I agree!";
                case 1, 2, 3 -> "Um, no.";
                case 6,7 -> "I like these too";
                default -> "no episode in that number";
            };
            System.out.println(days);//prints the answer for the movies
        }
    }
}
