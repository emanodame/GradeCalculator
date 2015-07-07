  package grade.calculator.pkg2.pkg0;
import java.util.Scanner;

public class GradeCalculatorv2 {
    /*Setting instance variables for mark and weight. Final because of speed. */
    final double mark;
    final double weight;
    
    /*Initiating the mark/weight variables.*/
    public GradeCalculatorv2(double mark, double weight){
        this.mark = mark;
        this.weight= weight;
    }
    
    /*This method gets the mark and weight and performs calculations to get the total mark.
    Mark/100* weight of the assingment/exam is the equation used for sum.*/
    public final double total(){
        return (mark/100) * weight;        
    }
    
    /*This takes an array argument of marks/weights.
    In every element of the array this method uses the total() method equation 
    and adds up all the results and inserts in sum variable.
    */
    public static final double getAverage(GradeCalculatorv2[] arr){
        double sum = 0;
        for (int i = 0; i<arr.length; i++ )
            sum += arr[i].total();
        return sum;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Simply enter your Grade Percentage and the weighted amount it has. This has to equal 100%.");
        System.out.println("Please enter how many assignments/exams you want to evaluate.");
        int counter = input.nextInt();
        System.out.println("Okay thank you, now enter your grade/weight.");
        System.out.println("FORMAT: Grade Percentage/Mark(enter)Weight of Work(enter)");
        
        
        GradeCalculatorv2[] arr = new GradeCalculatorv2[counter];
        
        /*User enters how many times they want to add an exam/assingment. 
        This for loop stops further user input when required. */
        for (int i = 0; i<counter; i++){
            double mark = input.nextDouble();
            double weight = input.nextDouble();
            arr[i] = new GradeCalculatorv2(mark, weight); 
                    }
        System.out.println("mark"+counter+"is"+GradeCalculatorv2.getAverage(arr));
        
        
        
    }
}

