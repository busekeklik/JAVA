package LowLevelFile;

import java.io.*;

class JFileInputStream {

    public static void main(String[] args) throws IOException {

        File inFile = new File("sample1.data");
        FileInputStream inStream = new FileInputStream(inFile);

        int fileSize = (int) inFile.length();
        byte[] byteArray = new byte[fileSize];

        inStream.read(byteArray);
        for(int i = 0; i < fileSize; i++) {
                System.out.println(byteArray[i]);
        }
        inStream.close();
    }
}
