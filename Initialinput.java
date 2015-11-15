import javax.swing.*;

public class Initialinput extends JFrame{
    //Making objects for all these variables.
    private JPanel panel;
    private JLabel welcome;
    private JLabel instructions;
    private JLabel number;
    private JTextField num;
    private JButton button;
    private JButton load;
    private JButton createNew;

    public void foundationmaker(){
        //JPanel getting added.
        panel = new JPanel();

        //Welcome JLabel..Contains the welcome message.
        welcome = new JLabel("Welcome to my Grade Calculator program!");
        panel.add(welcome);

        //Instructions J Label on how to work the program.
        instructions = new JLabel("Either start a new Grade Calculation or load up your old mark.             ");
        panel.add(instructions);

        //JLabel---How many different assignments do the user want to evaluate?
        number = new JLabel("<html><br>Please Enter how many assignments/exams you want to evaluate? (Max 15)</html>");
        panel.add(number);

        //JTextField assigner.
        num = new JTextField(16);
        panel.add(num);
        num.addActionListener(new GradeInputs(num)); //Action listener for the Textfield in case the user presses the enter key.

        //Enter button
        button = new JButton("Enter");
        panel.add(button);
        //This action listener button opens the new class Gradeanalysis().The next window.
        button.addActionListener(new GradeInputs(num));

        load = new JButton("Load");
        panel.add(load);
        //This action listener goes to the new load class Retrieve.
        load.addActionListener( new Retrieve());




        //JFrame maker.
        setTitle("Grade Calculator-Emmanuel Odame-Asante");
        setSize(600,250);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(panel);

    }

    public static void main(String[] args) {
        new Initialinput().foundationmaker();


    }
}

    
