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

public class UI {
    private Scanner scanner;
    
    public UI(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
        Grades grades = new Grades();
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            int grade = Integer.valueOf(scanner.nextLine());
            if(grade == -1){
                grades.printAllAverage();
                grades.printPassingAverage();
                grades.printPassingPercentage();
                grades.printDistribution();
                break;
            }
            grades.addGrades(grade);
        }
    }
    
}
