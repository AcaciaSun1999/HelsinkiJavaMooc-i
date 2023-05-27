
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPara = Integer.valueOf(scanner.nextLine());
        int secondPara= Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(firstPara, secondPara);

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int i = beginning; i <= end; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
