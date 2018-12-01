import javax.swing.*;
class monogram{
    public static void main(String[] args){
        String firstName, lastName;
        firstName = JOptionPane.showInputDialog(null, "Enter your  first name ");
        lastName = JOptionPane.showInputDialog(null, "Enter your   lastname");
        JOptionPane.showMessageDialog(null, firstName + " " + lastName);
    }
}