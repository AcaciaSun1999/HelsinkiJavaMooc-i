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

public class Room {
    private ArrayList<Person>personList;
    
    public Room(){
        this.personList = new ArrayList<>();
    }
    
    public void add(Person person){
        personList.add(person);
    }
    
    public boolean isEmpty(){
        if(personList.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return personList;
    }
    
    public Person shortest(){
        if(personList.size() == 0){
            return null;
        }
        Person shortestPerson = personList.get(0);
        for(Person compared : personList){
            if(compared.getHeight() <= shortestPerson.getHeight()){
                shortestPerson = compared;
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        Person shortestPerson = this.shortest();
        personList.remove(shortestPerson);
        return shortestPerson;
    }
}
