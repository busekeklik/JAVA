package Student;

import java.io.*;
import java.util.*;
import javax.swing.*;

class ComputeGrades extends MainWindow {

    private static final int DEFAULT_SIZE = 25;
    private static final String UNDER_GRAD = "U";
    private static final String GRAD = "G";
    private static final String END_OF_FILE_STR = "END";

    private OutputBox   outputBox;
    private Student[]   roster;
    private int         studentCount;

    public ComputeGrades() {
        this (DEFAULT_SIZE);
    }
    public ComputeGrades(int arraySize) {
        super();   // an explicit call to the supercalss constructor

        outputBox   = new OutputBox(this);

        roster      = new Student[arraySize];

        studentCount = 0;
    }

    public static void main(String[] args) {
      ComputeGrades gradeComputer = new ComputeGrades();
      gradeComputer.processData();
    }

    public void processData() {
         setVisible(true);
         outputBox.setVisible(true);

         boolean success = readData();

         if (success) {
            computeGrade();
            printResult();
         } else {
            outputBox.println("File Input Error");
         }
    }

    private boolean buildRoster(String filename) {
        String  inputLine;
        Student student;

        File             inFile;
        FileReader       fileReader;
        BufferedReader   bufReader;

        boolean status   = true;
        boolean done     = false;

        try {
           inFile = new File(filename);
           fileReader = new FileReader(inFile);
           bufReader = new BufferedReader(fileReader);

           while ( !done ) {

              inputLine = bufReader.readLine(); //read one line

              if (inputLine.equalsIgnoreCase(END_OF_FILE_STR)) {
                 done = true;
              }
              else {
                 student = createStudent(inputLine);

                 if (student != null) {
                    roster[studentCount] = student;
                    studentCount++;
                 }
              }
           } // while

           bufReader.close();
        }
        catch (IOException e) {
            status = false;
        }

        return status;
    }

    private void computeGrade()
    {
        for (int i = 0; i < studentCount; i++) {
           roster[i].computeCourseGrade();
        }
    }

    private Student createStudent(String line) {
        Student          student;
        StringTokenizer  parser = new StringTokenizer(line);
        String           type;

        try {
           type = parser.nextToken();

           if (type.equals(UNDER_GRAD) || type.equals(GRAD)) {

              student = newStudentWithData(type, parser);

           } else {

              student = null;
           }
        } catch (NoSuchElementException e) { //no token
           student = null;
        }

        return student;
    }

    private Student newStudentWithData(String type, StringTokenizer parser) {
        Student student;

        try {
            if (type.equals(UNDER_GRAD)) {

               student = new UndergraduateStudent();

            } else {

               student = new GraduateStudent();
            }

            //set the student name
            String  firstName   = parser.nextToken();
            String  lastName    = parser.nextToken();

            student.setName(firstName + " " + lastName);

            //set the student test scores
            for (int testNum = 1; testNum <= Student.NUM_OF_TESTS; testNum++) {
               student.setTestScore( testNum, Integer.parseInt(parser.nextToken()));
            }
        } catch (Exception e) { //either parser.nextToken() or
                                //Integer.parseInt(...)  thrown exception
            student = null;
        }

        return student;

    }

    private void printResult() {
        for (int i = 0; i < studentCount; i++) {

            //print one student
            outputBox.print(roster[i].getName());

            for (int testNum = 1; testNum <= Student.NUM_OF_TESTS; testNum++) {

                outputBox.print("\t" + roster[i].getTestScore(testNum));
            }

            outputBox.println("\t" + roster[i].getCourseGrade());
        }
    }

    private boolean readData() {
        //get file to open
        JFileChooser fileChooser = new JFileChooser(".");
                                        //start the listing from the current directory

        int returnVal = fileChooser.showOpenDialog(this);

        boolean result = false;

        if(returnVal == JFileChooser.APPROVE_OPTION) {
           String filename = fileChooser.getSelectedFile().getAbsolutePath();

            if (filename != null) {

                result = buildRoster(filename);
            }
        }

        return result;
    }
}
