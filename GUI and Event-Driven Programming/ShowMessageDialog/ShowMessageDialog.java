package ShowMessageDialog;

import javax.swing.*;

class ShowMessageDialog{

    public static void main(String[] args) {

        JFrame jFrame;

        jFrame = new JFrame();

        jFrame.setSize(400,300);
        jFrame.setVisible(true);

        JOptionPane.showMessageDialog(jFrame, "How are you?");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


//JFrame -> JFrame is a top-level container that provides a window on the screen.
// JOptionPAne-> this class provide a simple GUI-based input output //javax.swing.JOptionPane
//showMessageDialog ->class method, so we are not creating a JOptionPAne object 
//                  ->for a simply display of text
//for more complex text we use JDialog
