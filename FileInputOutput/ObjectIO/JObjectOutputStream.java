package ObjectIO;

import java.io.*;

class JObjectOutputStream {
    public static void main(String[] args) throws IOException {
        File outFile = new File("objects.dat");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);

        Person person;
        for(int i= 0; i < 10; i++) {
            person = new Person("Mr.Espresso"+i, 20+i, 'M');

            outObjectStream.writeObject(person);
        }

        outObjectStream.close();
    }    
}
