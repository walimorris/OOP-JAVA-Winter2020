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
    
    /**
     * constructs a new person with the given values
     @param fn   sets Person's first name
     @param ln   sets Person's last name
     @param age  sets Person's age
     @param by   sets Person's birth year
     @param ht   sets Person's height
     @param wt   Sets Person's weight
     */
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

    /** 
     * Instance method to add weight
     * @param pounds weight in pounds added to Person's current weight
     */
    public void gain(double pounds) {
        this.weight += pounds;
    }

    /** 
     * Instance method to subtract weight. Do not add a subtraction symbol for amount of
     * weight to subtract. An unsigned integer or float will do.
     * @param pounds weight in pounds subtracted from Person's current weight 
     */
    public void drop(double pounds) {
        this.weight -= pounds;
    }

    /** 
     * Instance method to add age
     * @param num integer amount to add to Person's current age in years
     */
    public void age(int num) {
        this.age += num;
    }

    /** 
     * Accessors are unlike mutators the state of an object doesn't change. Rather, the state 
     * of the object is reported. Below are a few class accessor methods. 
     * @return fullname The Person's first and last name combined
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    /** 
     * get the Person's age
     * @return age The Person's current age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * get the Person's height, should remain the same unless needs to be changed
     * if so, see changeHeight()
     * @return height get Person's height
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * weight may change, returns current weight as a double
     * @return wight get Person's current wight
     */
    public double getWeight() {
        return weight;
    }
    // returns birthyear 
    public int getBirthYear() {
        return birthyear;
    }
    // returns the firstname of Person
    public String getFirstName() {
        return firstName;
    }
    // returns the lastname of Person
    public String getLastName() {
        return lastName;
    }
}

/* A short client program using the Person.java class 
 *
 * Author : Wali Morris
 * File   : PersonMain1.java
 * Date   : 02/17/2020
 */

public class PersonMain1 {
    public static void main(String[] args) {
        // Create a person 
        Person p = new Person("Wali", "Morris", 29, 1991, 72.5, 220.2);
        // get persons full name
        String fullName = p.getFullName();
        if(p.getAge() > 21) {
            System.out.println("Hire " + fullName);
        } else {
            System.out.println("Let's work on an internship with " + fullName);
        }
        double tall = 74.0; // height in inches  
        if(p.getHeight() >= tall) {
            System.out.println(fullName + " is tall");
        } else {
            System.out.println(fullName + " is not tall..." );
        }
        System.out.println(fullName + " started at " + p.getWeight() + "lbs.");
        System.out.print("but after training for a mountain climb " + fullName);
        p.drop(20);
        System.out.println(" weighed in at " + p.getWeight() + "lbs!");
        System.out.println("A hundred years roll by...");
        int currentAge = p.getAge();
        while(p.getAge() <= currentAge + 100) {
            if(p.getAge() > 60) {
                p.age(1);
                System.out.println(p.getAge() + " Years young!");
            } else {
                p.age(1);
                System.out.println(p.getAge() + " years old");
            }
        }
    }
}

/* Point.java Class 
 * 
 * A Point object represents a pair of (x, y) coordinates.
 *
 * This file is from Building Java Programs textbook. Chapter 8 exercises 
 * include building upon the Point.java class introduced in this chapter's
 * text. 
 *
 * Author: Wali Morris 
 * File  : Point.java 
 * Date  : 02/18/2020
 */

public class Point {
    private int x;
    private int y;

    // constructs a new point at the origin (0, 0)
    public Point() {
        this(0, 0); // calls Point(int, int) constructor
    }

    /**
     * constructs a new point with the given (x, y) location
     * @param x sets x coordinate
     * @param y sets y coordinate
     */
    public Point(int x, int y) {
        setLocation(x, y);
    }

    // returns the distance between this Point and (0, 0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    // returns the x-coordinate of this point 
    public int getX() {
        return x;
    }

    // returns the y-coordinate of this point
    public int getY() {
        return y;
    }

    // returns true if the given point lines up vertically with this point. 
    public boolean isVertical(Point other) {
        if(this.x == other.x) {
            return true;
        } else {
            return false;
        }
    }

    // returns which quandrant of the x/y plane the current Point object falls in 
    public int quadrant() {
        if(x > 0 && y > 0) {
            return 1;
        } else if(x < 0 && y > 0) {
            return 2;
        } else if(x < 0 && y< 0) {
            return 3;
        } else if(x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    
     /**
     * Returns the "Manhattan distance", refers to the distance between two 
     * places if one can travel between them only by moving horizontally 
     * or vertically, as though driving on the streets of Manhattan.
     * @param Point The current (x, y) coordinates 
     * @param other The (x, y) coordinates of the other point
     */
    public int manhattanDistance(Point other) {
        return (this.x - other.x) + (this.y - other.y);
    }

    /**
     * Set points (x, y) coordinates 
     * @param x The points x coordinate 
     * @param y The points y coordinate 
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // returns a String representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
    
    // Negates and swaps the x/y coordinates of the Point object
    public void flip() {
        int temp = this.x; // hold x value
        this.x = y * -1;
        this.y = temp * -1;
    }
}

    
/* A short client program for the Point.java class
 *
 * Author : Wali Morris 
 * File   : PointMain.java
 * Date   : 02/18/2020
 */

import java.util.*;

public class PointMain {
    public static void main(String[] args) {
        // create two point objects 
        Point p1 = new Point(5, 2);
        Point p2 = new Point(9, 13);

        // show which quandrants the points live
        int quadrantp1 = p1.quadrant();
        int quadrantp2 = p2.quadrant();
        System.out.println("Point " + p1 + " is in quadrant " + quadrantp1);
        System.out.println("Point " + p2 + " is in quadrant " + quadrantp2);

        // show the current points 
        System.out.print("Before the points are flipped p1 = " + p1.toString());
        System.out.println(" p2 = " + p2.toString());

        // flip the points 
        p1.flip();
        p2.flip();

        // print the new flipped points 
        System.out.print("After the points are flipped p1 = " + p1.toString());
        System.out.println(" p2 = " + p2.toString());
        
        // get the manhattan distance between point 1 and point 2
        int manDist = p1.manhattanDistance(p2);
        System.out.print("Manhattan Distance from " + p1.toString() + " and " + p2.toString() + " is: ");
        System.out.println(manDist);

        // check if Points are vertical 
        System.out.print("Are " + p1.toString() + " and " + p2.toString() + " vertical: ");
        System.out.println(p1.isVertical(p2));
    }
}

 

    
