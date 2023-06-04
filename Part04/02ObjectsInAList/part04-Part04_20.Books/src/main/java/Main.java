import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book>booklist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            booklist.add(new Book (title, pages, publicationYear));
        }
        
        System.out.println("What information will be printed? ");
        String wantedInfo = scanner.nextLine();
        if(wantedInfo.equals("everything")){
            for(int i = 0; i < booklist.size(); i++){
                System.out.println(booklist.get(i).toString());
            }
        }
        if(wantedInfo.equals("name")){
            for(int i = 0; i < booklist.size(); i++){
                System.out.println(booklist.get(i).getName());
            }
        }

    }
}
