/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 12 Sample Program: Serializable Person class

    File: Person.java
*/

import java.io.*;

/**
 * The Person class used in Chapter 11. 
 * Modified to implement the Serializable interface
 */
class Person implements Serializable {

//----------------------------------
//    Data Members
//----------------------------------

    /**
     * Constant for the Name attribute
     */
    public static final int NAME = 0;

    /**
     * Constant for the Age attribute
     */
    public static final int AGE = 1;

    /**
     * Constant for comparison result p1 < p2
     */
    private static final int LESS = -1;

    /**
     * Constant for comparison result p1 == p2
     */
    private static final int EQUAL = 0;

    /**
     * Constant for comparison result p1 > p2
     */
    private static final int MORE  = 1;

    /**
     * Attribute for comparing the Person objects
     */
    private static int compareAttribute;

    /**
     * The name of this person
     */
    private String  name;

    /**
     * The age of this person
     */
    private int     age;

    /**
     * The gender of this person
     */
    private char    gender;


//------------------------------------
//
//    Static Initializer
//
//------------------------------------

    /**
     * Initializes the name as the default
     * comparison attribute.
     */
    static {

       compareAttribute = NAME;
    }

//----------------------------------
//    Constructors
//----------------------------------

    /**
     * Default constructor
     */
    public Person() {
        this("Not Given", 0, 'U');
    }

    /**
     * Constructs a new Person with passed name,
     * age, and gender.
     *
     * @param name   name of the new Person
     * @param age    age of the new Person
     * @param gender gender of the new Person
     */
    public Person(String name, int age, char gender) {
        this.age    = age;
        this.name   = name;
        this.gender = gender;
    }


//-------------------------------------------------
//      Public Methods:
//
//          void    setCompareAttribute (   int  )
//
//          int     compare   ( Person, int  )
//          int     compareTo ( Person       )
//
//          int     getAge    (              )
//          char    getGender (              )
//          String  getName   (              )
//
//          void    setAge    (   int        )
//          void    setGender (   char       )
//          void    setName   (   String     )
//
//          String  toString  (              )
//
//------------------------------------------------


    /**
     * Sets the attribute used in comparing two
     * Person objects
     *
     * @param attribute attribute of a Person used
     *                  for comparing
     *
     */
    public static void setCompareAttribute( int attribute ) {
        compareAttribute = attribute;
    }

    /**
     * Compares this Person with the parameter person
     * using attribute as a comparison criteria
     *
     * @param person    a person to compare with this person
     * @param attribute attribute used for comparison
     *
     * @return the comparison result
     */
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

        } else { //compare the name using the String class’s
                //compareTo method
            String    p2name = person.getName( );
            comparisonResult = this.name.compareTo(p2name);
        }

        return comparisonResult;
    }

    /**
     * Compares this Person with the parameter person
     * using currently set comparisonAttribute.
     *
     * @param person    a person to compare with this person
     *
     * @return the comparison result
     */
    public int compareTo( Person person ) {

        return compareTo(person, compareAttribute);
    }

    /**
     * Returns the age of this person.
     *
     * @return the age of this person
     */
    public int getAge( ) {
        return age;
    }

    /**
     * Returns the gender of this person.
     *
     * @return the gender of this person
     */
    public char getGender( ) {
        return gender;
    }

    /**
     * Returns the name of this person.
     *
     * @return the name of this person
     */
    public String getName( ) {
        return name;
    }

    /**
     * Sets the age of this person.
     *
     * @param age this person's age
     */
    public void setAge( int age ) {
        this.age = age;
    }


    /**
     * Sets the gender of this person.
     *
     * @param gender this person's age
     */
    public void setGender( char gender ) {
        this.gender = gender;
    }

    /**
     * Sets the name of this person.
     *
     * @param age this person's name
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * Converts the Person info to String format
     *
     * @return the Person info represented as String
     */
    public String toString( )  {
        return this.name    + "\t\t" +
               this.age     + "\t\t" +
               this.gender;
    }


}