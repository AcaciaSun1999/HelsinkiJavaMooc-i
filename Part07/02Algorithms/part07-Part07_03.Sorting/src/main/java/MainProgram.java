
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[]array){
        // write your code here
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] <= smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] <= smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if(table[i] <= smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int number = array[index2];
        array[index2] = array[index1];
        array[index1] = number;
        
    }
    
    public static void sort(int[] array) {
        // write your code here
        for(int i = 0; i < array.length; i++){
            System.out.println(array);
            int smallestIndexFrom = indexOfSmallestFrom(array,i);
            swap(array,i,smallestIndexFrom);
        }
        
    }
    
    
}
