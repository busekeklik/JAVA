package NestedPanels;

import javax.swing.*;
import java.awt.*;

class NestedPanels2 extends JFrame{
    private static final int FRAME_WIDTH    = 250;
    private static final int FRAME_HEIGHT   = 270;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private final String ENTER = "Enter";
    private final String CANCEL = "Cancel";
    private final String BLANK = "";
    private JTextField guessEntry;
    private JLabel     hint;

    public static void main(String[] args) {
        NestedPanels2 frame = new NestedPanels2();
        frame.setVisible(true);
    }

    public NestedPanels2( ) {
        JPanel  guessPanel, hintPanel,
                controlPanel, buttonPanel;

        JButton enterBtn, cancelBtn;

        Container contentPane;

        //set the frame properties
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14NestedPanels2");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );

        contentPane.setLayout(new GridLayout(3, 1));

        guessPanel = new JPanel();
        guessPanel.setBorder(BorderFactory.createTitledBorder("Your Guess"));
        guessPanel.add(guessEntry = new JTextField(10));

        hintPanel = new JPanel();
        hintPanel.setBorder(BorderFactory.createTitledBorder("Hint"));
        hintPanel.add(hint = new JLabel("Let's Play HiLo"));

        controlPanel = new JPanel(new BorderLayout());
        buttonPanel  = new JPanel();
        buttonPanel.add(enterBtn = new JButton(ENTER));
        buttonPanel.add(cancelBtn = new JButton(CANCEL));
        controlPanel.add(buttonPanel, BorderLayout.SOUTH);

        contentPane.add(guessPanel);
        contentPane.add(hintPanel);
        contentPane.add(controlPanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
