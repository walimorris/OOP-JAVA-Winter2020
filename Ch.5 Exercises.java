/* Write a method called showTwos that shows the factors of 2 in a given 
 * integer. 
 *
 * Author : Wali Morris 
 * File   : FactorsOf2.java
 * Date   : 01/17/2020 
 */

public class FactorsOf2 {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }

    /* This function takes one arguement, an integer n, which is 
     * decided if its divisible by two. If not, then 2 is not a 
     * factor of n. If n is divisible by two, showTwos() divides 
     * n / 2 and that value becomes n; until this n value % 2 
     * doesn't equal 0, the loop continues. Every iteration '2 *'
     * is added to the print summary. After the condition is met 
     * the final value of n is printed.
     */
    public static void showTwos(int n) {
        if(!(n % 2 == 0)) {
            System.out.printf(n + " = %d\n", n);
        } else {
            System.out.printf("%d = ", n);
            while(n % 2 == 0) {
                System.out.print("2 * ");
                n = n / 2;
            }

            System.out.println(n);
        }
    }
    
