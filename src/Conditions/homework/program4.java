package homework;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the date in the format Year/MM/DD");// prompting the user to enter the input in the above format
        String value = scan.nextLine();
        String [] split = value.split("/",5);//using array and split method to split the date into year, month and day
        String result=call(split[0],split[1],split[2]);//calling the function using individual year, month and day.
        System.out.println(result);// printing the new date format received from the function
        /* for(String a: split){
            System.out.println(a);
        }*/
    }
    public static String call(String Year, String Month, String date){//function starts from here
        //The following switch case is used to convert the number in the month to required string.
        String value = switch(Month){
            case "01" ->"January";
            case "02" -> "February";
            case "03" -> "March";
            case "04" -> "April";
            case "05" -> "May";
            case "06" -> "June";
            case "07" -> "July";
            case "08" -> "August";
            case "09" -> "September";
            case "10" -> "October";
            case "11" -> "November";
            case "12" -> "December";
            default -> "not a valid month";
        };
        String value2 = switch(date){//The following switch case is used to insert the necessary suffix behind number
            case "01", "21","31" -> "st";
            case "02","22" -> "nd";
            case "03","23" -> "rd";
            default -> "th";
        };
        //The following if condition is used to get the single digit number starting with zero, and it will remove the zero from it
        if(date.equals("01")||date.equals("02")||date.equals("03")||date.equals("04")||date.equals("05")||date.equals("06")||date.equals("07")||date.equals("08")||date.equals("09")){
            date=date.substring(1);//removing the index 1, In this case, ero is removed fromm the single digit numbers
        }
        return value+" "+date+value2+", "+Year;//returning the converted date format to the Graph.main function
    }
}
