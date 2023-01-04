package ButtonEvents;
import javax.swing.*;
import java.awt.*;

public class ButtonEvents extends JFrame{

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;

    public static void main(String[] args){

        ButtonEvents frame = new ButtonEvents();
        frame.setVisible(true);
    }

    public ButtonEvents() {
        Container contentPane = getContentPane();

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     (" BUTTON EVENTS ");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);

        ButtonHandler handler = new ButtonHandler();
        cancelButton.addActionListener(handler);
        okButton.addActionListener(handler);
        
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
}
