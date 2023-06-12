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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();
    }
    
    public int totalWeight(){
        int sumWeight = 0;
        for(Suitcase aSuitcase: suitcaseList){
            sumWeight = sumWeight + aSuitcase.totalWeight();
        }
        return sumWeight;
    }
    
    public String toString(){
        int sumWeight = this.totalWeight();
        
        if(suitcaseList.size() == 0){
            return "no suitcases (0 kg)";
        }
        
        if(suitcaseList.size() == 1){
            return suitcaseList.size() + "suitcases （" + sumWeight + " kg)";
        }
        return suitcaseList.size() + "suitcases （" + sumWeight + " kg)";
        
    }
    
    public void addSuitcase(Suitcase suitcase){
        int sumWeight = this.totalWeight();
        if(sumWeight + suitcase.totalWeight() <= maxWeight){
            suitcaseList.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcaseList){
            suitcase.printItems();
        }
    }
    
}
