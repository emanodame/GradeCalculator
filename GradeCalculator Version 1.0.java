/*Version 1 of Grade Calculator. Made by Emmanuel Odame-Asante. Many improvments will follow. 
Need to save more lines of code, add many more features and comment*/

import java.util.Scanner;
public class GradeCalculator {

    public static void main(String[] args) {
        /*This section is just full of text
        instructing the user how to user the program.
        */
        
        System.out.println("Simply enter your Grade Percentage and the weighted amount it has. This has to equal 100%.");
        System.out.println("Firstly, enter how many different assingmnets/exams do you want to evaluate.");
        Scanner count = new Scanner(System.in);
        int counter = count.nextInt();
        System.out.println("Okay thank you, now enter your grade/weight.");
        System.out.println("FORMAT: Grade Percentage(enter)Weight of Work(enter)"); 
        
       
        Scanner input = new Scanner(System.in);
        
        double mark = input.nextDouble();
        double promark = (mark/100);
        double weight = input.nextDouble();
        double total = (promark*weight);
        double finalmark = (total);
        if (counter==1){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark);
        System.exit(0);
        }
        
        double mark1 = input.nextDouble();
        double promark1 = (mark1/100);
        double weight1 =input.nextDouble();
        double total1 = (promark1*weight1);
        double finalmark1 = (total+total1);
        if (counter==2){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark1);
        System.exit(0);
        }
        
        double mark2 = input.nextDouble();
        double promark2 = (mark2/100);
        double weight2 =input.nextDouble();
        double total2 = (promark2*weight2);
        double finalmark2 = (total+total1+total2);
        if (counter==3){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark2);
        System.exit(0);
        }
        
        
        double mark3 = input.nextDouble();
        double promark3 = (mark3/100);
        double weight3 =input.nextDouble();
        double total3 = (promark3*weight3);
        double finalmark3 = (total+total1+total2+total3);
        if (counter==4){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark3);
        System.exit(0);
        }
        
        double mark4 = input.nextDouble();
        double promark4 = (mark4/100);
        double weight4 = input.nextDouble();
        double total4 = (promark4*weight4);
        double finalmark4 = (total+total1+total2+total3+total4);
        if(counter==5){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark4);
        System.exit(0);
        }
        
        double mark5 = input.nextDouble();
        double promark5 = (mark5/100);
        double weight5 =input.nextDouble();
        double total5 = (promark5*weight5);
        double finalmark5 = (total+total1+total2+total3+total4+total5);
        if(counter==5){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark5);
        System.exit(0);
        }
                
        double mark6 = input.nextDouble();
        double promark6 = (mark6/100);
        double weight6 =input.nextDouble();
        double total6 = (promark6*weight6);
        double finalmark6 = (total+total1+total2+total3+total4+total5+total6);
        if(counter==6){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark6);
        System.exit(0);
        }
        
        double mark7 = input.nextDouble();
        double promark7 = (mark7/100);
        double weight7=input.nextDouble();
        double total7 = (promark7*weight7);
        double finalmark7 = (total+total1+total2+total3+total4+total5+total6+total7);
        if(counter==7){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark7);
        System.exit(0);
        }
        
        double mark8 = input.nextDouble();
        double promark8 = (mark8/100);
        double weight8 = input.nextDouble();
        double total8 = (promark8*weight);
        double finalmark8 = (total+total1+total2+total3+total4+total5+total6+total7+total8);
        if(counter==8){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark8);
        System.exit(0);
        }
        
        double mark9 = input.nextDouble();
        double promark9 = (mark9/100);
        double weight9 =input.nextDouble();
        double total9 = (promark9*weight9);
        double finalmark9 = (total+total1+total2+total3+total4+total5+total6+total7+total8+total9);
        if(counter==9){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark9);
        System.exit(0);
        }
        
        double mark10 = input.nextDouble();
        double promark10 = (mark10/100);
        double weight10 =input.nextDouble();
        double total10 = (promark10*weight10);
        double finalmark10 = (total+total1+total2+total3+total4+total5+total6+total7+total8+total9+total10);
        if(counter==10){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark10);
        System.exit(0);
        }
        
        double mark11 = input.nextDouble();
        double promark11 = (mark11/100);
        double weight11 =input.nextDouble();
        double total11 = (promark11*weight11);
        double finalmark11 = (total+total1+total2+total3+total4+total5+total6+total7+total8+total9+total10+total11);
        if(counter==11){
        System.out.println("The average mark for your "+counter+" assignments/exams is "+finalmark11);
        System.exit(0);
        }   
    
    }
}
