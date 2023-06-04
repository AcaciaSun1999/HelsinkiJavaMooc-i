
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String stringInput = scanner.nextLine();
            if(stringInput.equals("end")){
                break;
            } else{
                int input = Integer.valueOf(stringInput);
                int cube = input * input * input;
                System.out.println(cube);
            }
        }

    }
}
