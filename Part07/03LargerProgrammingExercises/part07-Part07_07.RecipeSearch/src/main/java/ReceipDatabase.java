/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */

import java.util.ArrayList;

public class ReceipDatabase {
    
    private ArrayList<Receips>receipDatabase;
    
    public ReceipDatabase(){
        this.receipDatabase = new ArrayList<>();
    }
    
    public void addReceip(Receips receip){
        this.receipDatabase.add(receip);
    }
    
    public void searchByName(String inputName){
        for(Receips receip : receipDatabase){
            if(receip.nameContains(inputName)){
                System.out.println(receip);
            }
        }
    }
    
    public void searchByCookingTime(int inputTime){
        for(Receips receip : receipDatabase){
            if(receip.getCookingTime() <= inputTime){
                System.out.println(receip);
            }
        }
    }
    
    public void searchByIngredients(String inputIngredients){
        for(Receips receip : receipDatabase){
            if(receip.ingredientsContains(inputIngredients)){
                System.out.println(receip);
            }
        }
    }
    
    
    public void printAllReceips(){
        for(Receips receip : receipDatabase){
            System.out.println(receip);
        }
    }
    
}
