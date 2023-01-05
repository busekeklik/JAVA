package SketchPad;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SketchPad extends JFrame implements MouseListener, MouseMotionListener{
    private static final int FRAME_WIDTH    = 450;
    private static final int FRAME_HEIGHT   = 300;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private int last_x;
    private int last_y;
    public static void main(String[] args) {
        SketchPad frame = new SketchPad();
        frame.setVisible(true);
    }

    public SketchPad( ) {
        //set frame properties
        setTitle    ("Chapter 14 SketchPad");
        setSize     ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable( false );
        setLocation ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        last_x = last_y = 0;

        addMouseListener( this );       //adds itself as mouse and
        addMouseMotionListener( this ); //mouse motion listener
    }

    public void mousePressed( MouseEvent event ) {
        int x = event.getX();
        int y = event.getY();

        if ( event.isMetaDown() ) {
            //the right mouse button is pressed, so erase the contents
            Graphics    g = getGraphics();
            Rectangle   r = getBounds();
            g.clearRect(0, 0, r.width, r.height);
            g.dispose();
        } else {
            last_x = x;
            last_y = y;
        }
    }

    public void mouseClicked ( MouseEvent event ) { }
    public void mouseEntered ( MouseEvent event ) { }
    public void mouseExited  ( MouseEvent event ) { }
    public void mouseReleased( MouseEvent event ) { }

    public void mouseDragged( MouseEvent event ) {
        int x = event.getX();
        int y = event.getY();

        if ( !event.isMetaDown() ) {
            Graphics g = getGraphics();

            g.drawLine(last_x, last_y, x, y);
            g.dispose();

            last_x = x;
            last_y = y;
        }
    }

    public void mouseMoved ( MouseEvent event ) { }
}
