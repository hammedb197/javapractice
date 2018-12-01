// import java.util.Date;

// class pract3{
//     public static void main(String[] args){

// Date today = new Date( );
// SimpleDateFormat sdf1, sdf2;
// sdf1 = new SimpleDateFormat( );
// // sdf2 = new SimpleDateFormat( “MMMM dd, yyyy” );
// sdf1.format(today);
// // sdf2.format(today);
//     }
// }

import javax.swing.*;
class pract3 {
public static void main (String[ ] args) {
    String name;
    name = JOptionPane.showInputDialog(null,"Enter your full name first, middle, last:");
    JOptionPane.showMessageDialog(null, name);
    }
}