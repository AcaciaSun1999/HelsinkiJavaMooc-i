/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    
    private Scanner scanner;
    private ReceipDatabase receipdatabase;
    
    public UI(Scanner scanner){
        this.scanner = scanner;
        this.receipdatabase = new ReceipDatabase();
    }
    
    public void start(){
        fileRead();
        System.out.println("Commands:\n" +
                           "list - lists the recipes\n" +
                           "stop - stops the program\n" +
                           "find name - searches recipes by name\n" +
                           "find cooking time - searches recipes by cooking time\n" +
                           "find ingredient - searches recipes by ingredient");
        while(true){
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                list();
            }
            if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searchedWord = scanner.nextLine();
                findName(searchedWord);
            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                findCookingTime(maxTime);
            }
            if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                findIngredient(ingredient);
            }
        }
    }
    
    public void fileRead(){
        System.out.println("File to read: ");
        String filename = scanner.nextLine();
        String lines = "";
        ArrayList<String>aRecipe = new ArrayList<>();
        try(Scanner filescanner = new Scanner(Paths.get(filename))){
            while(filescanner.hasNextLine()){
                String row = filescanner.nextLine();
                if(row.isEmpty() || !filescanner.hasNextLine()){
                    aRecipe.add(lines);
                    lines = "";
                }else{ 
                    lines = lines + row + ",";
                }
            }
        } catch (Exception e){
            System.out.println("Wrong");
        }
        for(String receipInALine : aRecipe){
            String []receipInParts = receipInALine.split(",");
            String name = receipInParts[0];
            int time = Integer.valueOf(receipInParts[1]);
            ArrayList<String>ingredients = new ArrayList<>();
            for(int i = 2; i < receipInParts.length; i++){
                ingredients.add(receipInParts[i]);
            }
            receipdatabase.addReceip(new Receips(name,time,ingredients));
        }   
    }
    
    public void list(){
        System.out.println("Recipes:");
        receipdatabase.printAllReceips();
    }
    
    public void findName(String searchedName){
        System.out.println("Recipes:");
        receipdatabase.searchByName(searchedName);
    }
    
    public void findCookingTime(int maxTime){
        System.out.println("Recipes:");
        receipdatabase.searchByCookingTime(maxTime);
    }
    
    public void findIngredient(String searchedIngredient){
        System.out.println("Recipes:");
        receipdatabase.searchByIngredients(searchedIngredient);
    }
    
}
