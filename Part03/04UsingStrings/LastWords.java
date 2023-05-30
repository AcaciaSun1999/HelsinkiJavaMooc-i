
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String string = scanner.nextLine();
            if(string.equals("")){
                break;
            }
            String[] pieces = string.split(" ");
            int lastIndex = pieces.length - 1;
            System.out.println(pieces[lastIndex]);

        }
    }
}