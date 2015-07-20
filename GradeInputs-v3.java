

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


    public class GradeInputs extends JFrame implements ActionListener {
   
    private JTextField textfield; //TextField from Initialinput which records the number of assignments.
    private JTextField mark = null; //Firstly initializes the JTextField mark so it can work with Action Listener.
    private JTextField weight = null; //Firstly initializes the JTextField weight so it can work with Action Listener.

    //Making the object for that variable.
    public GradeInputs(JTextField textfield){
    this.textfield = textfield;
    }
    
    //These are there representations of borders of a container. NormalInsets = JTextfields. Final = JLabels.
    private static final Insets normalInsets = new Insets(10,10,0,10);
    private static final Insets finalInsets = new Insets(10,10,10,10);
    
    
//This is the method that gets the input from user from the Initialinput GUI. 
    @Override
    public void actionPerformed(ActionEvent e) {     
    
    String userinput = textfield.getText(); // Gets the textfrom the field.
    int userint = Integer.parseInt(userinput); // Turns the string into an Int.      
    
    JFrame frame = new JFrame("Grade Calculator by Emmanuel Odame-Asante");
    //Sets the basis of the frame.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(createMainPanel(userint));
    frame.pack();
    frame.setVisible(true);
    }
       
    //Initialsing the JPanels. userint is part of the method signature (a parameter). This determines the layout of the GUI for this class.
    private JPanel createMainPanel(int userint){
    int gridy = 0;
    
    JTextField[] markTextFields = new JTextField[userint]; //Holds individual data. Size depends on the number of assignments.
    JTextField[] weightTextFields = new JTextField[userint];
    GridBagConstraints gbc = new GridBagConstraints();
        
    //Adding the JPanels. Panel for instructions
    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());
        
    //JLabel for the Instructions and formatting.
    JTextArea instructionTextArea = new JTextArea(5, 30);
    instructionTextArea.setEditable(false);
    instructionTextArea.setLineWrap(true);
    instructionTextArea.setWrapStyleWord(true);
    instructionTextArea.setText(getInstructions());
    JScrollPane instructionScrollPane = new JScrollPane(instructionTextArea);
    addComponent(panel, instructionScrollPane, 0, gridy++, 3, 1, finalInsets, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
    
    //JLabels for Assignment.
    JLabel assignmentlabel = new JLabel("Assignment");
    assignmentlabel.setHorizontalAlignment(JLabel.CENTER);
    addComponent(panel, assignmentlabel, 0, gridy, 1, 1, finalInsets,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
        
   //JLabel for Mark
   JLabel marklabel = new JLabel("Mark");
   marklabel.setHorizontalAlignment(JLabel.CENTER);
   addComponent(panel, marklabel, 1, gridy, 1, 1, finalInsets, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
        
   //JLabel for Weight.
   JLabel weightlabel = new JLabel("Weight (Percent)");
   weightlabel.setHorizontalAlignment(JLabel.CENTER);
   addComponent(panel, weightlabel, 2, gridy++, 1, 1, finalInsets, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
        
   //JLabel Number for the number list of assignments at the side.
   gbc.gridy = 3; //gbc.gridy at y position 3 all the time so it correctly aligns.
   for(int i = 1; i<=userint; i++){
   String stringnumbers = String.valueOf(i); //This is responsible for making the for loop a String which can be listed down. I get strings of the incrementing for loops.  
   JLabel number = new JLabel(stringnumbers); 
   number.setHorizontalAlignment(JLabel.CENTER);
   addComponent(panel, number, 0, gbc.gridy++, 1, 1, normalInsets, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
   }
        
   gbc.gridy = 3;    
   //JTextfield for Mark
   for(int i=0; i<userint; i++){
   mark = new JTextField(20);
   markTextFields[i] = mark; //For each mark in the JTextField they get inserted into markTextField[i] with a for loop.
   mark.setHorizontalAlignment(JLabel.CENTER);
   addComponent(panel, mark, 1, gbc.gridy++, 1, 1, normalInsets, GridBagConstraints.CENTER,GridBagConstraints.NONE);
   }
   
   gbc.gridy = 3;
   //JTextfield for Weight
   for(int i=0; i<userint; i++){  
   weight = new JTextField(20);
   weightTextFields[i]= weight;
   weight.setHorizontalAlignment(JLabel.CENTER);   
   addComponent(panel, weight, 2, gbc.gridy++, 1, 1, normalInsets, GridBagConstraints.CENTER,GridBagConstraints.NONE);
   }
   
   //Reset JButton which resets all JTextFields.
   JButton resetbutton = new JButton("Reset");
   resetbutton.setHorizontalAlignment(SwingConstants.CENTER);
   addComponent(panel, resetbutton, 3, gbc.gridy++, 1,1,normalInsets,GridBagConstraints.CENTER,GridBagConstraints.CENTER);
   resetbutton.addActionListener(new ActionListener(){
        
   @Override //This loops around all weight/mark text fields and blanks them all. (Empty String).
   public void actionPerformed(ActionEvent e) {
   for(int i = 0; i<userint; i++){
   weightTextFields[i].setText("");
   markTextFields[i].setText("");
   }
   }    
   });
       
   //JButton for sending all the data from this class to the next class that calculate the data.
   JButton computebutton = new JButton("Compute");
   computebutton.setHorizontalAlignment(SwingConstants.CENTER);
   addComponent(panel, computebutton, 3, gbc.gridy++, 1, 1, normalInsets, GridBagConstraints.CENTER,GridBagConstraints.CENTER);
   computebutton.addActionListener(new ActionListener() {
        
   @Override //This is were the magic happens. All of the TextFields are iterated through and finalScore gets updated.
   public void actionPerformed(ActionEvent e) {
   double finalScore = 0;
   for (int i = 0; i < userint; i++) {
   double weight = Double.parseDouble(weightTextFields[i].getText());                
   double mark = Double.parseDouble(markTextFields[i].getText());
   if(mark<0){
   JOptionPane.showMessageDialog(null,"You have entered a negative mark! Please enter again.");
   System.exit(0);
   }
   if(weight >100){
   JOptionPane.showMessageDialog(null,"Output might be strange due to total percentage being over 100%");
   }
   finalScore += weight / 100 * mark;
   }
   JOptionPane.showMessageDialog(null, "Final score: " + finalScore, "Final Score", JOptionPane.OK_OPTION);
   }
   });
   return panel;
   }
 
    //Method that returns a string of some instructions"
    private String getInstructions(){
        return ("Instructions: Type in the grades you’ve received, along with the weights they’ll have in the determination of your overall average.                                                                                                                     After you press ‘Calculate’, the results will show your average so far.                                                   Every grade you enter must be a non-negative number, and every percentage/weight you enter must be a positive number. Also make sure the total Weight Percentage equals 100%. :)");
    }
    
    //Method that is responsible for the object making of JLabels/TextFields/JPanels.
    private void addComponent(Container container, Component component, int gridx, int gridy, int gridwidth, int gridheight, Insets insets, int anchor, int fill ){
    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0D,1.0D,anchor,fill,insets,0,0);
    container.add(component,gbc);
    }
}
   
    
    
    
            

     

    
      
        
