package JFrameSubclass;

import javax.swing.*;
import java.awt.*;

class JFrameSubclass extends JFrame{

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public static void main(String[] args) {
        JFrameSubclass frame = new JFrameSubclass();
        frame.setVisible(true);
    }

    public JFrameSubclass( ) {

        setTitle     ( "Pink Background JFrame Subclass" );
        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );

        setDefaultCloseOperation( EXIT_ON_CLOSE );

        changeBkColor( );
    }

    private void changeBkColor() {
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.PINK);
   }
}
