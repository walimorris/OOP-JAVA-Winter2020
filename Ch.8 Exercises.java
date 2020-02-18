// Chapter 8 is an introduction to object Oriented Programming and encapsulation

/* Following along with Ch.8: Object-Oriented Programming. This class uses 
 * a Person object rather than the book's Point object from java.awt class. 
 *
 * Author : Wali Morris
 * File   : Person.java
 * Date   : 02/17/2020
 */

/* FIELD: A VARIABLE INSIDE AN OBJECT THAT MAKES UP PART OF ITS INTERNAL STATE.
 * WHEN WE DECLARE A FIELD WE'RE SAYING WE WANT EVERY OBJECT OF THIS CLASS TO 
 * HAVE THAT VARIABLE INSIDE IT.
 * 
 * In this case I'll ask myself: what are the things that make up a person? 
 * Name, age, height, weight are some things for now. */

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int birthyear;
    private double height;
    private double weight;
    
    // constructs a new person with the given values
    public Person(String fn, String ln, int age, int by, double ht, double wt) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = age;
        this.birthyear = by;       
        this.height = ht;    
        this.weight = wt;    
    }
    
    /* INSTANCE METHODS: A METHOD INSIDE AN OBJECT THAT OPERATES ON THAT OBJECT. 
     * Some things I can think of doing: gaining and losing weight, and getting 
     * older. Instance methods can be thought of as mutators; changing the state 
     * of an object. */

    // Instance method to add weight 
    public void gain(double pounds) {
        this.weight += pounds;
    }

    /* Instance method to subtract weight. Do not add a subtraction symbol for amount of
     * weight to subtract. An unsigned integer or float will do.
     */
    public void drop(double pounds) {
        this.weight -= pounds;
    }

    // Instance method to add age 
    public void age(int num) {
        this.age += num;
    }

    /* Accessors are unlike mutators; the state of an object doesn't change. Rather, the state 
     * of the object is reported. Below are a few class accessor methods. 
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getBirthYear() {
        return birthyear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
