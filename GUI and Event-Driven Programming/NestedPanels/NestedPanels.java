package NestedPanels;

import java.awt.*;
import javax.swing.*;

class NestedPanels extends JFrame {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public static void main(String[] args) {
        NestedPanels frame = new NestedPanels();
        frame.setVisible(true);
    }

    public NestedPanels() {
        Container         contentPane;
        TicTacToePanel    gamePanel;
        JPanel            controlPanel;
        JPanel            scorePanel;

        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setTitle     ("Program Ch14NestedPanels1");
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setLayout(new BorderLayout(10, 0));

        gamePanel = new TicTacToePanel();
        gamePanel.setBorder(BorderFactory.createLoweredBevelBorder());
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout( ));

        contentPane.add(gamePanel, BorderLayout.CENTER);
        contentPane.add(controlPanel, BorderLayout.EAST);

        
        scorePanel = new JPanel();
        scorePanel.setBorder( BorderFactory.createTitledBorder("Scores:"));
        scorePanel.setLayout(new GridLayout(2, 2));
        scorePanel.add(new JLabel("Player 1:"));
        scorePanel.add(new JLabel("     0"));
        scorePanel.add(new JLabel("Player 2:"));
        scorePanel.add(new JLabel("     0"));

        controlPanel.add(scorePanel,BorderLayout.NORTH);
        controlPanel.add(new JButton("New Game"), BorderLayout.SOUTH);
        
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }    
}
