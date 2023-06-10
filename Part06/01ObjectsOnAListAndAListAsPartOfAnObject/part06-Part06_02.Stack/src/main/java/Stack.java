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
public class Stack {
    private ArrayList<String>list;
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take(){
        String returnValue = list.get(list.size()-1);
        list.remove(list.get(list.size()-1));
        return returnValue;
    }
}
