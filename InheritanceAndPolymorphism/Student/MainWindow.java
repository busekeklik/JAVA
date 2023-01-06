package Student;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWindow extends JFrame {

    private static final String  DEFAULT_TITLE = "Sample Java Application";
    private static final int HORIZONTAL_MARGIN = 40;
    private static final int VERTICAL_MARGIN   = 80;
    private Dimension screenSize;

    public MainWindow() {
        this( DEFAULT_TITLE );
    }

    public MainWindow(String title) {
        super(title);
        initialize( );
    }

    protected void moveToCenter()  {
         Dimension selfBounds = getSize();
         setLocation((screenSize.width - selfBounds.width) / 2,
                     (screenSize.height - selfBounds.height) / 2);
    }

    private void initialize(  ) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        screenSize      = toolkit.getScreenSize();

        setSize(screenSize.width-HORIZONTAL_MARGIN,screenSize.height-VERTICAL_MARGIN);

        Container contentPane = getContentPane();
        contentPane.setBackground( Color.white );

        moveToCenter();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}