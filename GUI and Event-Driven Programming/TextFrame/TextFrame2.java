package TextFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class TextFrame2 extends JFrame implements ActionListener {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private JButton cancelButton;
    private JButton okButton;
    private JTextField inputLine;
    private JLabel prompt;
    private JLabel image;

    public static void main(String[] args) {
        TextFrame2 frame = new TextFrame2();
        frame.setVisible(true);
    }
    
    public TextFrame2() {
        Container contentPane;

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("Program TextFrame1");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setLayout(new FlowLayout());

        image = new JLabel(new ImageIcon("cat.gif"));
        image.setSize(50, 50);
        contentPane.add(image);

        prompt = new JLabel( );
        prompt.setText("Please enter your name");
        //alternative way to create the prompt
        //  prompt = new JLabel( "Please enter your name");
        prompt.setSize(150, 25);
        contentPane.add(prompt);

        inputLine = new JTextField();
        inputLine.setColumns(22);

        contentPane.add(inputLine);

        inputLine.addActionListener(this);

        okButton = new JButton("OK");
        contentPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        contentPane.add(cancelButton);

        cancelButton.addActionListener(this);
        okButton.addActionListener(this);

        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();

            String  buttonText = clickedButton.getText();

            setTitle("You clicked " + buttonText);

        } else {
            setTitle("You entered '" + inputLine.getText() + "'");
        }
    }
}
