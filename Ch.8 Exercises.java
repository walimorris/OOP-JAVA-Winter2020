// Chapter 8 is an introduction to object Oriented Programming and encapsulation

/** 
 * The Product class is a generic product description which includes a product
 * code, product description, and product count 
 *
 * @author : Wali Morris 
 * File    : Product.java
 * Date    : 03/09/2020
 */

import java.util.*;
import java.text.*;

public class Product {
    private int code;
    private String description;
    private double price;
    private int count;

    /**
     * Constructor to initialize full product with code, description, price
     * @param  code  this is a product ID linking this product
     * @param  desc  a short description of this product
     * @param  price a floating point price of this product
     * @param  count the number of products available  
     */
    public Product(int code, String desc, double price, int count) {
        this.code = code;
        this.description = desc;
        this.price = price;
        this.count = count; // number of products in inventory 
    }
    
    /**
     * A constructor to initialize a zeroed Product
     */
    public Product() {
        this(0, null, 0, 0);
    }
    
    /**
     * method to setCode or product id
     * @param id products id number 
     */
    public void setCode(int id) {
        this.code = id;
    }

    /**
     * method to receive this products id number
     * @return product id code
     */
    public int getCode() {
        return this.code;
    }

    /**
     * method to set a product description
     * @param desc product description
     */
    public void setDescription(String desc) {
        this.description = desc;
    }
    
    /**
     * this method returns the description of this product 
     * if description is null, this method returns the string
     * "no description"
     * @return product's description 
     */
    public String getDescription() {
        try {
            if ( this.description.equals(null) ) {
                return this.description;
            }
        } catch ( NullPointerException e) {
            return "no description";
        }
        return this.description;
    }

    /**
     * this method sets a product price 
     * @param price a products price as a float
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * This method formats the price of a product
     * @return current product floating price as a String
     */
    public String getPrice() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
    
    /**
     * This method formats the price of a bundle of products 
     * @return bundle price
     */
    public String getBundlePrice() {
        double bundlePrice = this.price * this.getCount();
        String price = NumberFormat.getCurrencyInstance().format(bundlePrice);
        return price;
    }

    /**
     * This method sets a product count 
     * @param num the current number of products
     */
    public void setCount(int num) {
        this.count = num;
    }

    /**
     * method to get the current count of this product
     * @return the number of products currently
     */
    public int getCount() {
        return this.count;
    }

    /** 
     * A method to add to product count
     * @param num the number of products to add to this product
     */
    public void add(int num) {
        this.count += num;
    }
    
    /**
     * A method to subtract from product count
     * @param num the number of products to decrease
     */
    public void drop(int num) {
        this.count -= num;
    }

    /**
     * returns the complete data of a product
     * @returns the product id, description, price and count
     */
    public String toString() {
        String result = "(" + "Product id: " + this.getCode() + ", " + "Description: "
                         + this.getDescription() + ", " + "Price: " + this.getPrice()
                         + ", " + "Count: " + this.getCount() + ")";

        return result;
    }
}

/* A short client program using the generic Product class API
 *
 * Author : Wali Morris 
 * File   : ProductMain.java
 * Date   : 03/09/2020
 */

import java.util.*;

public class ProductMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // product p1: initialize  
        Product p1 = new Product();
        System.out.println("P1 Product Description: " + p1.getDescription()); // testing getDescription() method
        p1.setCode(1234);
        p1.setDescription("Seasonal Calender");
        p1.setPrice(5.99);
        p1.setCount(10);
        System.out.println("Number of Calenders: " + p1.getCount());

        // add calenders
        System.out.print("How many calenders would you like to add to order: ");
        int order1 = console.nextInt();
        p1.add(order1);
        System.out.println("After this order of calenders you now have: " + p1.getCount());
        System.out.println("Calender order Summary: " + p1.toString());
        System.out.println("Total Price: " + p1.getBundlePrice());
        System.out.println();

        // Product 2    
        Product p2 = new Product(5678, "Healthy Cat Food", 12.00, 5);
        System.out.println("The Price of " + p2.getCount() + " bags of cat food: " + p2.getBundlePrice());
        p2.drop(2);
        System.out.println("Cat Food order Summary: " + p2.toString());
        System.out.println("Total Price: " + p2.getBundlePrice());
    }
}
    
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
        if(x < 0 || y < 0) { 
            throw new IllegalArgumentException("x and y coords must be greater than zero."); 
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
    public boolean isVertical(object o) {
        if(o instanceof Point) {
            Point other = (Point) o;
            return this.x == other.x && this.y == other.y; 
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
    
    /**
     * @param  Another (x,y) point object
     * @return Slope
     */
    public double slope(Point other) {
        if(this.x == other.x) { 
            throw new IllegalArgumentException("x-coordinates must be different");
        } else {
            return ((double)other.y - (double)this.x) / ((double)other.y - (double)this.y);
        }
    }

    /**
     * @param two other (x,y) points
     * @return true or false if points are collinear
     * points are collinear when their x or y coordinates are equal 
     * or when their slopes are equal
     */
    public boolean isCollinear(Point p1, Point p2) {
        try {
            // all y-coordinates may be equal, testing slope equality checks this case
            double slopeA = slope(p1); // get slope of this point and point1
            if(slopeA == slope(p2)) { // same x-coordinates will attempt to throw exception
                return true; // if slopes are equal return true
            }
        } catch(Exception e) { // catches x-coordinate exception
            if(p2.x == p1.x) { // returns true if all x coordinates are equal
                return true;
            }
        }
        return false;
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
        
        // get slope of p1 and p2
        double slope = p1.slope(p2);
        System.out.println("The slope of " + p1.toString() + " and " + p2.toString() + ": " + slope);

        // create a new pont: initialize with same point x as p1: should catch exception
        Point p3 = new Point(-2, 5);

        // collinear note
        System.out.print("Collinear points are three points with the same x or y coordinates");
        System.out.println(" or, simply, equal slopes.");
        System.out.println("The next series of tests conducts experiments with collinear and non-collinear points");

        // test collinear of current points
        boolean collinear = p1.isCollinear(p2, p3);
        System.out.print("Points " + p1.toString() + ", " + p2.toString() + ", " + p3.toString());
        System.out.println(" is Collinear: " + collinear);

        // create 3 new points
        Point p4 = new Point(1, 2);
        Point p5 = new Point(1, 4);
        Point p6 = new Point(1, 6);
        boolean collinear2 = p4.isCollinear(p5, p6);
        System.out.print("Points " + p4.toString() + ", " + p5.toString() + ", " + p6.toString());
        System.out.println(" is Collinear: " + collinear2);

        // create 3 points with same y-coordinates
        Point p7 = new Point(1, 5);
        Point p8 = new Point(8, 5);
        Point p9 = new Point(11, 5);
        boolean collinear3 = p7.isCollinear(p8, p9);
        System.out.print("Points " + p7.toString() + ", " + p8.toString() + ", " + p9.toString());
        System.out.println(" is Collinear: " + collinear3);

    }
}


 

    
