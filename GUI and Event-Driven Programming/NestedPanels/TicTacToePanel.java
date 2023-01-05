package NestedPanels;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class TicTacToePanel extends JPanel implements MouseListener {

    private boolean circle;


    public TicTacToePanel() {
        this(3);
    }

    public TicTacToePanel(int size) {

        TicTacToeCell cell;

        setLayout(new GridLayout(size, size));

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                cell = new TicTacToeCell( );

                cell.addMouseListener(this);
                add(cell);
            }
        }
        circle = true;
    }
    public void mouseClicked(MouseEvent event) {

        TicTacToeCell cell = (TicTacToeCell) event.getSource();

        if (circle) {
            cell.setContent(TicTacToeCell.Image.CIRCLE);
        } else {
            cell.setContent(TicTacToeCell.Image.CROSS);
        }

        circle = !circle;
    }
    public void mouseEntered   ( MouseEvent event ) { }
    public void mouseExited    ( MouseEvent event ) { }
    public void mousePressed   ( MouseEvent event ) { }
    public void mouseReleased  ( MouseEvent event ) { }

}