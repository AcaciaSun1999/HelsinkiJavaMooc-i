/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Cube {
    private int length;
    
    public Cube(int edgeLength){
        this.length = edgeLength;
    }
    
    public int volume(){
        return length * length * length;
    }
    
    public String toString(){
        return "The length of the edge is " + length + " and the volume " + this.volume();
    }
    
}
