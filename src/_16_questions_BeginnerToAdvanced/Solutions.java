package _16_questions_BeginnerToAdvanced;

public class Solutions {

    /* Question 1
    METHOD-1 -> findSumOf2Numbers
    Write a method that takes 2 int arguments and returns their sum
    TEST DATA:
    12, 5
    EXPECTED OUTPUT:
    17
     */

    public static int sum1(int a, int b){
        return a + b;
    }

    /* Question 2
    METHOD-2 -> findProductOf2Numbers
    Write a method that takes 2 int arguments and returns their product
    TEST DATA:
    12, 5
    EXPECTED OUTPUT:
    60
     */

    public static int product1(int a, int b){
        return a * b;
    }

     /* Question 3
    METHOD-3 -> findSubtractionOf2Numbers
    Write a method that takes 2 int arguments and returns their subtraction
    TEST DATA:
    12, 5
    EXPECTED OUTPUT:
    7
     */

    public static int subtract(int a, int b){
        return a - b;
    }

    /* Question 4
    METHOD-4 -> findDivisionOf2Numbers
    Write a method that takes 2 int arguments and returns their division
    TEST DATA:
    12, 5
    EXPECTED OUTPUT:
    2
     */

    public static int divide(int a, int b){
        return a / b;
    }

    /* Question 5
    METHOD-4 -> findRemainderOf2Numbers
    Write a method that takes 2 int arguments and returns their remainder
    TEST DATA:
    12, 5
    EXPECTED OUTPUT:
    2
     */

    public static int remainder(int a, int b){
        return a % b;
    }

    /* Question 6
    METHOD-1 -> isPositive
    Write a method that takes an int argument and returns true if it is positive
    and returns false if it is negative or zero
    TEST DATA:
    5
    EXPECTED OUTPUT:
    true
     */

    public static boolean positive(int a){
        return a > 0;
    }

    /* Question 7
    METHOD-2 -> isNegative
    Write a method that takes an int argument and returns true if it is negative
    and returns false if it is positive or zero
    TEST DATA:
    -1
    EXPECTED OUTPUT:
    true
     */

    public static boolean negative(int a){
        return a < 0;
    }

    /* Question 8
    METHOD-3 -> isZero
    Write a method that takes an int argument and returns true if it is zero (neutral)
    and returns false if it is positive or negative
    TEST DATA:
    0
    EXPECTED OUTPUT:
    true
     */

    public static boolean zero(int a){
        return a == 0;
    }

    /* Question 9
    METHOD-1 -> findGreatestOf2Numbers1
    Write a method that takes 2 int arguments and returns the greatest number
    NOTE: 2 numbers being same is okay
    TEST DATA:
    3, 5
    EXPECTED OUTPUT:
    5
     */

    public static int greatestNumber(int a, int b){
        return Math.max(a, b);
    }

    /* Question 10
    METHOD-2 -> findGreatestOf2Numbers2
    Write a method that takes 2 int arguments and returns the greatest number
    NOTE: 2 numbers being same is okay
    TEST DATA:
    3, 5
    EXPECTED OUTPUT:
    5

    Use if else statements to find max value of 2 int variables as below
     */

    public static int greatNumberIE(int a, int b){
        if(a >= b) return a;
        return b;
    }

    /* Question 11
    METHOD-3 -> findGreatestOf3Numbers1
    Write a method that takes 3 int arguments and returns the greatest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 3, 5
    EXPECTED OUTPUT:
    5
     */

    public static int greatestNumber1(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }

    /* Question 12
    METHOD-4 -> findGreatestOf3Numbers2
    Write a method that takes 3 int arguments and returns the greatest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 3, 5
    EXPECTED OUTPUT:
    5

    Use if else statements to find max value of 2 int variables as below
     */

    public static int greatestNumber2(int a, int b, int c) {

        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        return c;
    }

    /* Question 13
    METHOD-1 -> findSmallestOf2Numbers1
    Write a method that takes 2 int arguments and returns the smallest number
    NOTE: 2 numbers being same is okay
    TEST DATA:
    1, 7
    EXPECTED OUTPUT:
    1
     */

    public static int smallestNumber1(int a, int b){
        return Math.min(a, b);
    }

    /* Question 14
    METHOD-2 -> findSmallestOf2Numbers2
    Write a method that takes 2 int arguments and returns the smallest number
    NOTE: 2 numbers being same is okay
    TEST DATA:
    1, 7
    EXPECTED OUTPUT:
    1

    Use if else statements to find min value of 2 int variables as below
     */

    public static int smallestNumber2(int a, int b) {

        if(a <= b) return a;
        return b;
    }

    /* Question 15
    METHOD-3 -> findSmallestOf3Numbers1
    Write a method that takes 3 int arguments and returns the smallest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    1, 1, 7
    EXPECTED OUTPUT:
    1
     */

    public static int smallestOf3N(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }

    /* Question 16
    METHOD-4 -> findSmallestOf3Numbers2
    Write a method that takes 3 int arguments and returns the smallest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    1, 1, 7
    EXPECTED OUTPUT:
    1

     // Use if else statements to find min value of 3 int variables as below
     */

    public static int smallestOf3N2(int a, int b, int c){
        if(a <= b && a <= c) return a;
        else if(b <= a && b <= c) return b;
        return c;
    }

    /* Question 17
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 4, 5
    EXPECTED OUTPUT:
    4
     */

    public static int middleNumber(int a, int b, int c){
        if(a == b || b == c) return b;
        else if(a == c) return a;

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        if(a != max && a != min) return a;
        else if(b != max && b != min) return b;
        return c;
    }

    /*Question 18
    Write a method that takes a String argument and returns the String back with first and last word swapped
    NOTE: Assume that the given String will always have at least 2 words
    TEST DATA:
    "Java is fun"
    EXPECTED OUTPUT:
    fun is Java
     */

    public static String swapFirstLast(String str){
        String first = str.substring(0, str.indexOf(" "));
        String middle = str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" "));
        String last = str.substring(str.lastIndexOf(" ") + 1);
        return last + " " + middle + " " + first;
    }
}
