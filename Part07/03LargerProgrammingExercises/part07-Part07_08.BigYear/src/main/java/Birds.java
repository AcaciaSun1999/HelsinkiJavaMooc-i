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

public class Birds {
    
    private String name;
    private String nameInLatin;
    private int observation;
    
    public Birds(String name, String nameInLatin){
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observation = 0;
    }
    
    public void addAObervation(){
        this.observation = observation + 1;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.name + " (" + this.nameInLatin + "): " + this.observation + " observations";
    }
}
