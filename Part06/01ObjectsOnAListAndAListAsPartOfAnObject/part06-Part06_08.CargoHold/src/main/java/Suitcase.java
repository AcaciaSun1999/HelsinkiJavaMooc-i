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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> itemList;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.itemList = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int sumWeight = this.totalWeight();
        if(sumWeight + item.getWeight() <= maxWeight){
            itemList.add(item);
        }
    }
    
    public String toString(){
        int sumWeight = this.totalWeight();
        
        if(itemList.size() == 0){
            return "no items (0 kg)";
        }
        
        if(itemList.size() == 1){
            return itemList.size() + "item （" + sumWeight + " kg)";
        }
        return itemList.size() + "items （" + sumWeight + " kg)";
    }
    
    public void printItems(){
        for(Item item : itemList){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int sumWeight = 0;
        for(Item aItem: itemList){
            sumWeight = sumWeight + aItem.getWeight();
        }
        return sumWeight;
    }
    
    public Item heaviestItem(){
        if(itemList.size() == 0){
            return null;
        }
        Item heaviestItem = itemList.get(0);
        for(Item item : itemList){
            if(item.getWeight() >= heaviestItem.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
