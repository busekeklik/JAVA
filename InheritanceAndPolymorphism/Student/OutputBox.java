package Student;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class OutputBox extends JDialog {

    private static final String DEFAULT_TITLE = "Program Output";
    private static final int    DEFAULT_WIDTH = 550;
    private static final int    DEFAULT_HEIGHT = 380;
    private static final int    MAX_SKIPLINE  = 21;

    private static Font        font;
    private static String      newLine;
    private JTextArea    outputArea;

    static {
        newLine = System.getProperty("line.separator");
        font    = new Font("Courier",Font.PLAIN, 12);
    }
    public OutputBox(Frame owner, int width, int height, String title) {
        super(owner, false);

        initialize(width, height, title);
    }

    public OutputBox(Frame owner, int width, int height) {
       this(owner, width, height, DEFAULT_TITLE);
    }

    public OutputBox(Frame owner, String title) {
       this(owner, DEFAULT_WIDTH, DEFAULT_HEIGHT, title);
    }

    public OutputBox(Frame owner) {
       this(owner, DEFAULT_TITLE);
    }

    public void appendToFile( String fileName ) {
        writeToFile(fileName, true);
    }

    public void clear() {
        //clears the whole content
        outputArea.setText("");
    }

    public void print(boolean b) {
        print("" + b);
    }

    public void print(char ch) {
        print("" + ch);
    }

    public void print(double number) {
        print("" + number);
    }

    public void print(long number) {
        print("" + number);
    }

    public void print(String text) {
        outputArea.append(text);
    }

    public void print(StringBuffer strBuf) {
        print(strBuf.toString());
    }

    public void printLine(boolean b) {
        printLine("" + b);
    }

    public void printLine(char ch) {
        printLine("" + ch);
    }

    public void printLine(double number) {
        printLine("" + number);
    }

    public void printLine(long number) {
        printLine("" + number);
    }

    public void printLine(String text) {
        print(text);
        newLine();
    }

    public void printLine(StringBuffer strBuf) {
        printLine(strBuf.toString());
    }

    public void println(boolean b) {
        printLine("" + b);
    }

    public void println(char ch) {
        printLine("" + ch);
    }

    public void println(double number) {
        printLine("" + number);
    }

    public void println(long number) {
        printLine("" + number);
    }

    public void println(String text) {
        print(text);
        newLine();
    }

    public void println(StringBuffer strBuf) {
        printLine(strBuf.toString());
    }

    public void saveToFile( String fileName ) {
        writeToFile(fileName, false);
    }

    public void setFont(Font font) {
        if (outputArea != null) {
            outputArea.setFont(font);
        }

        this.font = font;
    }

    public void skipLine(int numberOfLines) {
        if (numberOfLines > 0 && numberOfLines < MAX_SKIPLINE) {
            for (int i = 0; i < numberOfLines; i++) {
                newLine();
            }
        }
    }

    public void waitUntilClose( ) {
        setVisible(false);
        setModal(true);
        setVisible(true);
    }

    private void initialize(int width, int height, String title) {
        setResizable(true);
        setTitle(title);

        outputArea = new JTextArea( );
        setContentPane(new JScrollPane(outputArea)); //make it scrollable
        setFont(font);

        setSize(width, height);

        moveToCenter();

        addWindowListener(
            new WindowAdapter( ) {
                public void windowClosing(WindowEvent e) {
                    dispose();
                    setModal(false);
                }
            }
        );
    }

    private void moveToCenter( ) {
         Toolkit toolkit = Toolkit.getDefaultToolkit();

         Dimension screenSize  = toolkit.getScreenSize();
         Dimension selfBounds  = getSize();

         setLocation((screenSize.width - selfBounds.width) / 2,
                     (screenSize.height - selfBounds.height) / 2);
    }

    private void newLine() {
        outputArea.append( newLine );
    }

    private void writeToFile( String fileName, boolean append) {
        try {
            FileWriter outputFile = new FileWriter(fileName, append);
            outputFile.write(outputArea.getText());
            outputFile.close();
        } catch (IOException e) {}
    }
}
