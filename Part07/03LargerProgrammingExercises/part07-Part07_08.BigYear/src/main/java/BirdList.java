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

public class BirdList {
    
    private ArrayList<Birds>birdList;
    
    public BirdList(){
        this.birdList = new ArrayList<>();
    }
    
    public void addABird(Birds bird){
        birdList.add(bird);
    }
    
    public boolean contains(String name){
        boolean contains = false;
        for(Birds bird : birdList){
            if(bird.getName().equals(name)){
                contains = true;
                break;
            }        
        }
        return contains;
    }
    
    public int getIndex(String name){
        int index = 0;
        for(int i = 0; i < birdList.size(); i++){
            if(birdList.get(i).getName().equals(name)){
                index = i;
            }
        }
        return index;
    }
    
    public Birds getBird(int i){
        return birdList.get(i);
    }
    
    public void printAllBirds(){
        for(Birds bird : birdList){
            System.out.println(bird);
        }
    }
}
