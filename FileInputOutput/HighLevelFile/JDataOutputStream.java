package HighLevelFile;

import java.io.*;

public class JDataOutputStream {
    
    public static void main(String[] args) throws IOException {

        File outFile = new File("sample2.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile); 
        DataOutputStream outDataStream = new DataOutputStream(outFileStream);

        outDataStream.writeInt(987654321);
        outDataStream.writeLong(11111111L);
        outDataStream.writeFloat(22222222F);
        outDataStream.writeDouble(3333333D);
        outDataStream.writeChar('A');
        outDataStream.writeBoolean(true);
    
        outDataStream.close();
    }
}
