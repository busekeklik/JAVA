package NestedPanels;

import java.awt.*;
import javax.swing.*;

public class TicTacToeCell extends JPanel  {


    public static enum Image {BLANK, CIRCLE, CROSS}
    private static final String CROSS_IMAGE_FILE = "cross.gif";
    private static final String CIRCLE_IMAGE_FILE = "circle.gif";
    private static final String BLANK_IMAGE_FILE  = "blank.gif";
    private JLabel content;
    private Point location;

    public TicTacToeCell( ) {
        this(null);
    }

    public TicTacToeCell(Point pt ) {

        ImageIcon initImage = new ImageIcon("blank.gif");

        setLayout(new BorderLayout());
        setBackground(Color.white);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        content = new JLabel(initImage);
        add(content);

        location = pt;
    }

    public Point getPosition( ) {
        return location;
    }

    public void setContent(Image image) {

        switch (image) {

            case CIRCLE: content.setIcon(new ImageIcon(CIRCLE_IMAGE_FILE));
                         break;

            case CROSS:  content.setIcon(new ImageIcon(CROSS_IMAGE_FILE));
                         break;

            default:    
                         break;
        }
    }
}