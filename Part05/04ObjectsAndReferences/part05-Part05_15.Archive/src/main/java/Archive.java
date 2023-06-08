/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Archive {
    private String indentifier;
    private String name;
    
    public Archive(String indentifier,String name){
        this.indentifier = indentifier;
        this.name = name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive)compared;
        if(this.indentifier.equals(comparedArchive.indentifier)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.indentifier + ": " + this.name;
    }
    
}
