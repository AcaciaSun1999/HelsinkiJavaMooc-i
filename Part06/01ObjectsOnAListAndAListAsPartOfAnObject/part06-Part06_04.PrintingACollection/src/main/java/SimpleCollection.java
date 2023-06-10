
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String output = "";
        if(elements.size() == 1){
            output = "The collection " + this.name + " has " + elements.size() + " element:" + "\n";
        }
        if(elements.size() >1){
            output = "The collection " + this.name + " has " + elements.size() + " elements:" + "\n";
        }
        String elementsValue = "";
        for(String element : elements){
            if(element.equals(elements.get(elements.size()-1))){
                elementsValue = elementsValue + element;
            }else{
                elementsValue = elementsValue + element + "\n";
            }
        }
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        return output + elementsValue;
    }
    
}
