
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = -1;
        String greatestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if(Integer.valueOf(pieces[1]) > greatest){
                greatest = Integer.valueOf(pieces[1]);
                greatestName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + greatestName);

    }
}
