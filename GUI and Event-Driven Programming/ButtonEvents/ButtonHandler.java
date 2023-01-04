package ButtonEvents;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonHandler implements ActionListener{
    
    public ButtonHandler(){
    }

    public void actionPerformed(ActionEvent event) {

        JButton clickedButton = (JButton) event.getSource();

        JRootPane rootPane = clickedButton.getRootPane( );
        Frame     frame    = (JFrame) rootPane.getParent();

        // JFrame frame = (JFrame) clickedButton.getRootPane().getParent();

        String  buttonText = clickedButton.getText();

        frame.setTitle("You clicked " + buttonText);
    }

}
