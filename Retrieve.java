import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.ArrayList;

public class Retrieve extends JFrame implements ActionListener  {
    private JPanel panel;
    private JLabel label;
    private JLabel label1;
    private JLabel label2;
    private JButton button;
    private JButton button1;
    private Connection con = null;
    private Connection con1 = null;


    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> groupNames = new ArrayList<String>();
        panel = new JPanel();
        label = new JLabel("Click the drop down menu to load the names of old saved marks.");
        label1 = new JLabel("                                          Select the name of your old data and press the retrieve button!                                     ");
        label2 = new JLabel("<html><br></html>");
        panel.add(label2);

        button = new JButton("Back");
        button1 = new JButton("Retrieve!");

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "9782";

        Statement stmt = null;
        String query = "SELECT Profile FROM SavedCalculations";
        try {
            System.out.println("Connecting to a selected database...");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected database successfully...");

            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                String groupname = rs.getString("Profile");
                groupNames.add(groupname);
            }
            rs.close();

        } catch (SQLException k) {
            JOptionPane.showMessageDialog(null,"Database error. See below.");
            k.printStackTrace();
        }


        JComboBox<String> cb = new JComboBox<String>();
        DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
        cb.setModel(model);

        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(cb);
        panel.add(button);
        panel.add(button1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Initialinput().foundationmaker();
            }
        });

        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (model.getSelectedItem() != null) {
                String selection = model.getSelectedItem().toString();
                String query1 = "SELECT * FROM SavedCalculations WHERE Profile = '" + selection + "'";
                try {
                    con1 = DriverManager.getConnection(url, user, password);
                    PreparedStatement stm = con1.prepareStatement(query1);
                    ResultSet rs = stm.executeQuery(query1);

                    rs.next();
                    String groupname = rs.getString("Mark");

                    JOptionPane.showMessageDialog(null, "Your mark saved is: " + groupname + "!");


                    rs.close();
                } catch (SQLException kool) {
                    JOptionPane.showMessageDialog(null,"Database error. See below.");
                    kool.printStackTrace();
                }


                }
        }}
        );

            //JFrame maker.
            setTitle("Grade Calculator-Emmanuel Odame-Asante");
            setSize(600, 250);
            setVisible(true);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            add(panel);

        }

    }
