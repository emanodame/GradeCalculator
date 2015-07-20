
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Initialinput extends JFrame{
    //Making objects for all these variables.
    private JPanel panel;
    private JLabel welcome;
    private JLabel instructions;
    private JLabel number;
    private JTextField num;
    private JButton button;
    
    public void foundationmaker(){
        //JPanel getting added.
        panel = new JPanel();
        
        //Welcome JLabel..Contains the welcome message.
        welcome = new JLabel("Welcome to my Grade Calculator program!");
        panel.add(welcome);
        
        //Instructions J Label on how to work the program.
        instructions = new JLabel("Enter your Mark and Weight to find your average grade!");
        panel.add(instructions);
        
        //JLabel---How many different assignments do the user want to evaluate?
        number = new JLabel("<html><br>Firstly, please enter how many assignments/exams you want to evaluate? (Max 25)</html>");
        panel.add(number);
        
        //JTextField assigner.
        num = new JTextField(18);
        panel.add(num);
        num.addActionListener(new GradeInputs(num)); //Action listener for the Textfield in case the user presses the enter key.
        
        
        //Enter button
        button = new JButton("Enter");
        panel.add(button);
        //This action listener button opens the new class Gradeanalysis().The next window.
        button.addActionListener(new GradeInputs(num));
        
        
        //JFrame maker.
        setTitle("Grade Calculator-Emmanuel Odame-Asante");
        setSize(575,250);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(panel);
        
       }
             
    public static void main(String[] args) {
        new Initialinput().foundationmaker();
        
        
        }
}

    
