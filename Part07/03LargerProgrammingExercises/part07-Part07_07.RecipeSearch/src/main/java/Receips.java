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


public class Receips {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Receips(String name, int cookingTime, ArrayList<String>ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public boolean nameContains(String inputName){
        boolean contains = false;
        if(this.name.contains(inputName)){
            contains = true;
        }
        return contains;
    }
    
    public boolean ingredientsContains(String inputIngredients){
        boolean contains = false;
        if(this.ingredients.contains(inputIngredients)){
            contains = true;
        }
        return contains;
    }
    
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime; 
    }
        
    
}
