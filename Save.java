import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Save implements ActionListener {
    private double finalScore;
    Connection conn = null;
    Statement stmt = null;

    public Save(double finalScore) {
        this.finalScore=finalScore;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "9782";
        String profilename = JOptionPane.showInputDialog(null,"Give a name for your saved mark.","Untitled");
        String sqlcommand = "INSERT INTO SavedCalculations (Profile,Mark)" + "VALUES ('"+profilename+"','"+finalScore+"')";

        if(profilename == null){
            return;
        }

        if(profilename != null && ("".equals(profilename))){
            JOptionPane.showMessageDialog(null,"You did not enter a file name!");
            return;
        }

            try{
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            stmt.executeUpdate(sqlcommand);
            System.out.println("Successfully saved mark into database. ");



        }catch(SQLException errorboys){
            errorboys.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error. See below.");
        }


    }
}
