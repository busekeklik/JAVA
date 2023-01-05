package BorderLayout;

import javax.swing.*;
import java.awt.*;

class BorderLayoutSample extends JFrame{
    
    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;


    public static void main(String[] args) {

        BorderLayoutSample frame = new BorderLayoutSample();
        frame.setVisible(true);
    }
    
    public BorderLayoutSample() {

        Container contentPane;
        JButton button1, button2, button3, button4, button5;

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14FlowLayoutSample");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setBackground( Color.PINK );
        contentPane.setLayout(new BorderLayout());
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");

        contentPane.add(button1,BorderLayout.NORTH);
        contentPane.add(button2,BorderLayout.SOUTH);
        contentPane.add(button3,BorderLayout.EAST);
        contentPane.add(button4, BorderLayout.WEST);
        contentPane.add(button5, BorderLayout.CENTER);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}
