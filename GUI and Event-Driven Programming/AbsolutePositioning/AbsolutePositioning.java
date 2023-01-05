package AbsolutePositioning;

import javax.swing.*;
import java.awt.*;

class AbsolutePositioning extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 80;
    private static final int BUTTON_HEIGHT = 30;


    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        AbsolutePositioning frame = new AbsolutePositioning();
        frame.setVisible(true);
    }

    public AbsolutePositioning() {

        Container contentPane = getContentPane( );

        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable ( false );
        setTitle     ( "Program Ch14AbsolutePositioning" );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );

        contentPane.setLayout( null );
        contentPane.setBackground( Color.WHITE );

        okButton = new JButton("OK");
        okButton.setBounds(70, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(160, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);

        setDefaultCloseOperation( EXIT_ON_CLOSE );

   }
}
