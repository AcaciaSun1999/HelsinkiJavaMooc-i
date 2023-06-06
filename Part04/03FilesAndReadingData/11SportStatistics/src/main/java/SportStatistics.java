
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int counter = 0;
        int win = 0;
        int loss = 0;
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String input = scanner.nextLine();
                String[] pieces = input.split(",");
                String homeTeam = pieces[0];
                String visitingTeam = pieces[1];
                int homePoint = Integer.valueOf(pieces[2]);
                int visitingPoint = Integer.valueOf(pieces[3]);
                if(homeTeam.equals(teamName)){
                    counter = counter + 1;
                    if(homePoint >= visitingPoint){
                        win = win + 1;
                    } else {
                        loss = loss + 1;
                    }
                }
                
                if(visitingTeam.equals(teamName)){
                    counter = counter + 1;
                    if(homePoint <= visitingPoint){
                        win = win + 1;
                    } else {
                        loss = loss + 1;
                    }
                }
            }
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + loss);
        }catch(Exception e){
            
        }

    }

}
