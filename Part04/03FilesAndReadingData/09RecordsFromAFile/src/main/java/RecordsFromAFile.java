
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                String[] list = row.split(",");
                String name = list[0];
                String age = list[1];
                System.out.println(name + ", " + "age: " + age + " years");
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
