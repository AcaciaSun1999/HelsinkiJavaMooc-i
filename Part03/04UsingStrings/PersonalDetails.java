
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfLongestName = 0;
        int number = 0;
        String longestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            int years = Integer.valueOf(pieces[1]);
            String name = pieces[0];
            sum = sum + years;
            number = number + 1;
            if(name.length() > numberOfLongestName){
                numberOfLongestName = name.length();
                longestName = name;
            }
            
        }
        double average = (double)sum / number;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
