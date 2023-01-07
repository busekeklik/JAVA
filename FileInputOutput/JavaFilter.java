import java.io.File;
import javax.swing.filechooser.*;

class JavaFilter extends FileFilter{
    
    private static final String JAVA = "java";
    private static final char DOT = ".";

    public boolean accept(File f) {
        if(f.isDirectory()) {
            return true;
        }
        if(extension(f).equalsIgnoreCase(JAVA)) {
            return true;
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "Java source files (.java)";
    }

    private String extension(File f) {
        String filename = f.getName();
        int     loc = filename.lastIndexOf(DOT);
    
        if(loc > 0 && loc < filename.length() - 1) {
            return filename.substring(loc + 1);
        } else {
            return "";
        }
    }
}
