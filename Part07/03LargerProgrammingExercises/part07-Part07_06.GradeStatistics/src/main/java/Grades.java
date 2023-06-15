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
import java.util.Collections;
import java.util.Scanner;

public class Grades {
    private ArrayList<Integer>gradesList;
    
    public Grades(){
        this.gradesList = new ArrayList<>();
    }
    
    public void addGrades(int grade){
        if(grade >= 0 && grade <= 100){
            gradesList.add(grade);
        }
    }
    
    public double getAllAverage(){
        int sum = 0;
        for(int grade : gradesList){
            sum = sum + grade;
        }
        double average = (double) sum / gradesList.size();
        return average;
    }
    
    public double getPassingAverage(){
        int sum = 0;
        int number = 0;
        for(int grade : gradesList){
            if(grade >= 50){
                sum = sum + grade;
                number = number + 1;
            }
        }
        double average = (double) sum / number;
        return average;
    }
    
    public double getPassingPercentage(){
        int pass = 0;
        for(int grade : gradesList){
            if(grade >= 50){
                pass = pass + 1;
            }
        }
        double passingPercentage = (double) pass / gradesList.size();
        return passingPercentage * 100;
    }
    
    public void printAllAverage(){
        System.out.println("Point average (all): " + this.getAllAverage());
    }
    
    public void printPassingAverage(){
        if(gradesList.size() == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.getPassingAverage());
        }  
    }
    
    public void printPassingPercentage(){
        System.out.println("Pass percentage: " + this.getPassingPercentage());
    }
    
    public int getDistribution(int grade){
        int distribution = 0;
        if(grade >= 90){
            distribution = 5;
        } else if(grade < 90 && grade >= 80){
            distribution = 4;
        } else if(grade < 80 && grade >= 70){
            distribution = 3;
        } else if(grade < 70 && grade >= 60){
            distribution = 2;
        } else if(grade < 60 && grade >= 50){
            distribution = 1;
        } else {
            distribution = 0;
        }
        return distribution;
    }
    
    public String getStars(int n){
        String stars = "";
        if(n == 0){
            stars = "";
        } else {
            for(int i = 0; i < n; i++){
                stars = stars + "*";
            }
        }
        return stars;
    }
    
    public void printDistribution(){
        int number0 = 0;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        for(int grade : gradesList){
            int distribution = this.getDistribution(grade);
            if(distribution == 0){
                number0 = number0 + 1;
            }
            if(distribution == 1){
                number1 = number1 + 1;
            }
            if(distribution == 2){
                number2 = number2 + 1;
            }
            if(distribution == 3){
                number3 = number3 + 1;
            }
            if(distribution == 4){
                number4 = number4 + 1;
            }
            if(distribution == 5){
                number5 = number5 + 1;
            }   
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + this.getStars(number5));
        System.out.println("4: " + this.getStars(number4));
        System.out.println("3: " + this.getStars(number3));
        System.out.println("2: " + this.getStars(number2));
        System.out.println("1: " + this.getStars(number1));
        System.out.println("0: " + this.getStars(number0));
    }
}
