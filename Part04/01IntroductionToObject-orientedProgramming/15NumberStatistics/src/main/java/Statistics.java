

public class Statistics {
    
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        count = count + 1;
        sum = sum + number;
    }

    public int getCount() {
        // write code here
        return count;
    }
    
    public int sum() {
        // write code here
        return sum;
    }

    public double average() {
        // write code here 
        if(this.getCount() != 0){
            return (double)this.sum() / this.getCount();
        } else {
            return 0.0;
        }
        
    }
    
}
