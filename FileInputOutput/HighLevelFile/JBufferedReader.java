package HighLevelFile;

import java.io.*;
class JBufferedReader {
    public static void main(String[] args) throws IOException {
        File inFile = new File("sample3.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String str;
        //get integer
        str = bufReader.readLine();
        int i = Integer.parseInt(str);
        //get long
        str = bufReader.readLine();
        long l = Long.parseLong(str);
        //get float
        str = bufReader.readLine();
        float f = Float.parseFloat(str);
        //get double
        str = bufReader.readLine();
        double d = Double.parseDouble(str);
        //get char
        str = bufReader.readLine();
        char c = str.charAt(0);
        //get boolean
        str = bufReader.readLine();
        Boolean boolObj = new Boolean(str);
        
        boolean b = boolObj.booleanValue();
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        //input done, so close the stream
        bufReader.close();
    }
}
