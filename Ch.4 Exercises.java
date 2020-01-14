/* Write a method called fractionSum that accepts an integer parameter n and 
 * returns as a double the sum of the first n terms of the sequence. You may
 * assume that the parameter n is non negative.
 *
 * Author : Wali Morris
 * File   : FractionSums.java
 * Date   : 01/13/2020 
 */

public class FractionSums {
    public static void main(String[] args) {
        double sum = fractionSum(8);
        System.out.printf("sum = %f\n", sum);
    }

    public static double fractionSum(int n) {
        double sum = 1.0;
        for(double i=2.0;i<=n;i++) {
            sum += 1.0/i;
        }

        return sum;
    }
}
