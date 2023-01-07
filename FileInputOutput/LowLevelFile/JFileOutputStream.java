package LowLevelFile;

import java.io.*;

class JFileOutputStream {
    
    public static void main(String[] args) throws IOException {

        File outFile = new File("sample1.data");
        FileOutputStream outStream = new FileOutputStream(outFile);

        byte[] byteArray = {10, 20, 30, 40, 50};

        outStream.write(byteArray);

        outStream.close();
    }
}
