import java.io.*;
import javax.swing.*;

class JFileChooser {
    public static void main(String[] args) {
        JFileChooser chooser;
        File         file, directory;
        int          status;

        chooser = new JFileChooser();

        status = chooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();
            
            System.out.println("Directory: " + directory.getName());

            System.out.println("File selected to open: " + file.getName());

            System.out.println("Full path name: " + file.getAbsolutePath());
    }   else {
        System.out.println("Open File dialog canceled");
    }

    System.out.println("\n\n");

    status = chooser.showSaveDialog(null);
    if (status == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();
            
            System.out.println("Directory: " + directory.getName());
            System.out.println("File selected for saving data: " + file.getName());
            System.out.println("Full path name: " + file.getAbsolutePath());
        } else {
        System.out.println("Save File dialog canceled");
        }
    }
}