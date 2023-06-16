/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private BirdList birdlist;
    
    public UI(Scanner scanner,BirdList birdList){
        this.scanner = scanner;
        this.birdlist = birdList;
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String command = scanner.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                Add();
            }
            if(command.equals("Observation")){
                Observation();
            }
            if(command.equals("All")){
                All();
            }
            if(command.equals("One")){
                One();
            }
        }
        
    }
    
    public void Add(){
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String nameInLatin = scanner.nextLine();
        Birds bird = new Birds(name, nameInLatin);
        birdlist.addABird(bird);   
    }
    
    public void Observation(){
        System.out.println("Bird?");
        String name = scanner.nextLine();
        if(birdlist.contains(name)){
            int index = birdlist.getIndex(name);
            Birds bird = birdlist.getBird(index);
            bird.addAObervation();
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public void All(){
        birdlist.printAllBirds();
    }
    
    public void One(){
        System.out.println("Bird?");
        String name = scanner.nextLine();
        if(birdlist.contains(name)){
            int index = birdlist.getIndex(name);
            Birds bird = birdlist.getBird(index);
            System.out.println(bird);
        } else {
            System.out.println("Not a bird!");
        }
    }
}
