package ButtonFrame;

import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame();
        frame.setVisible(true);
    }

    public ButtonFrame(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable ( false );
        setTitle     ( "Program Ch7JButtonFrame" );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        okButton = new JButton("OK");
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
