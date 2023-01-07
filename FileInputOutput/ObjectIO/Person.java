package ObjectIO;

import java.io.*;


class Person implements Serializable {

    public static final int NAME = 0;
    public static final int AGE = 1;
    private static final int LESS = -1;
    private static final int EQUAL = 0;
    private static final int MORE  = 1;
    private static int compareAttribute;
    private String  name;
    private int     age;
    private char    gender;


    static {

       compareAttribute = NAME;
    }

    public Person() {
        this("Not Given", 0, 'U');
    }

    public Person(String name, int age, char gender) {
        this.age    = age;
        this.name   = name;
        this.gender = gender;
    }

    public static void setCompareAttribute( int attribute ) {
        compareAttribute = attribute;
    }

    public int compareTo( Person person, int attribute ) {
        int comparisonResult;

        if ( attribute == AGE ) {
            int p2age = person.getAge( );

            if (this.age < p2age) {
                comparisonResult = LESS;
            } else if (this.age == p2age) {
                comparisonResult = EQUAL;
            } else {
                assert this.age > p2age;
                comparisonResult = MORE;
            }

        } else { //compare the name using the String class�s
                //compareTo method
            String    p2name = person.getName( );
            comparisonResult = this.name.compareTo(p2name);
        }

        return comparisonResult;
    }

    public int compareTo( Person person ) {

        return compareTo(person, compareAttribute);
    }

    public int getAge( ) {
        return age;
    }

    public char getGender( ) {
        return gender;
    }

    public String getName( ) {
        return name;
    }

    public void setAge( int age ) {
        this.age = age;
    }


    public void setGender( char gender ) {
        this.gender = gender;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String toString( )  {
        return this.name    + "\t\t" +
               this.age     + "\t\t" +
               this.gender;
    }


}