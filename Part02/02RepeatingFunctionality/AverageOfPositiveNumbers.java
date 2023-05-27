
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num > 0){
                sum = sum + num;
                counter = counter + 1;
            }
            if(num == 0){
                break;
            }
        }
        if(counter > 0){
            double average = (double)sum / counter;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
