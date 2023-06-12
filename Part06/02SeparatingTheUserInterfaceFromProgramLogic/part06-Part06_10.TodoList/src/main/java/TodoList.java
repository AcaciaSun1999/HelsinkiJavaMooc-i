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
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String>taskList;
    
    public TodoList(){
        this.taskList = new ArrayList<>();
    }
    
    public void add(String task){
        this.taskList.add(task);
    }
    
    public void print(){
        for(int i = 0; i < taskList.size(); i++){
            int index = i+1;
            System.out.println(index + ": " + taskList.get(i));
        }
    }
    
    public void remove(int number){
        taskList.remove(number - 1);
    }
}
