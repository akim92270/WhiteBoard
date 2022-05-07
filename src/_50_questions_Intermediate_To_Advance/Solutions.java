package _50_questions_Intermediate_To_Advance;

import java.util.*;

public class Solutions {
    /* Question 1
    Write a method that takes 3 int arguments and returns the greatest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    3, 3, 5
    EXPECTED OUTPUT:
    5
     */

    public static int greatestNumber1(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        return c;
    }

    public static int greatestNumber2(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int greatestNumber3(int a, int b, int c) {
        TreeSet<Integer> max = new TreeSet<>();
        max.add(a);
        max.add(b);
        max.add(c);
        return max.last();
    }

    public static int greatestNumber4(int a, int b, int c) {
        int[] max = {a, b, c};
        Arrays.sort(max);
        return max[2];
    }

    /* Question 2
    Write a method that takes 3 int arguments and returns the smallest number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    1, 7, 13
    EXPECTED OUTPUT:
    1
     */

    public static int smallestNumber1(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int smallestNumber2(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && a <= c) return c;
        return b;
    }

    public static int smallestNumber3(int a, int b, int c) {
        int[] min = {a, b, c};
        Arrays.sort(min);
        return min[0];
    }

    public static int smallestNumber4(int a, int b, int c) {
        TreeSet<Integer> small = new TreeSet<>();
        small.add(a);
        small.add(b);
        small.add(c);
        return small.first();
    }

    /* Question 3
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    4, 4, 5
    EXPECTED OUTPUT:
    4
     */

    public static int middleNumber1(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        return c;
    }

    public static int middleNumber2(int a, int b, int c) {
        int[] middle = {a, b, c};
        Arrays.sort(middle);
        return middle[1];
    }

    public static int middleNumber3(int a, int b, int c) {
        if (a >= b && b <= c) return b;
        else if (b >= a && a <= c) return a;
        return c;
    }

    /* Question 4
    Write a method that takes a String and returns reversed String
    TEST DATA:
    Hello
    EXPECTED OUTPUT:
    olleH
     */

    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverse3(String str) {
        StringBuilder reverse = new StringBuilder();
        reverse.append(str);
        reverse.reverse();
        return reverse.toString();
    }

    /* Question 5
    Write a method that takes a String and return String back with all digits removed
    TEST DATA:
    a1b2c3
    EXPECTED OUTPUT:
    abc
     */

    public static String removeDigits1(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String removeDigits2(String str) {
        char[] removeDigits = str.toCharArray();
        String remove = "";
        for (char removeDigit : removeDigits) {
            if (!Character.isDigit(removeDigit)) remove += removeDigit;
        }
        return remove;
    }

    public static String removeDigits3(String str) {
        String remove = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) remove += str;
        }
        return remove;
    }

    /* Question 6
    Write a method that takes a String and return String back with all spaces removed
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    Javaisfun
     */

    public static String noSpace1(String str) {
        return str.replaceAll(" ", "");
    }

    public static String noSpace2(String str) {
        String removeSpace = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) removeSpace += str.charAt(i);
        }
        return removeSpace;
    }

    public static String noSpace3(String str) {
        char[] noSpace = str.toCharArray();
        String noSpaces = "";

        for (char c : noSpace) {
            if(!Character.isWhitespace(c)) noSpaces += c;
        }
        return noSpaces;
    }

    public static String noSpace4(String str) {
        char[] noSpace = str.toCharArray();
        String noSpaces = "";

        for (int i = 0; i < noSpace.length; i++) {
            if(!Character.isWhitespace(noSpace[i])) noSpaces += noSpace[i];
        }
        return noSpaces;
    }

    /* Question 7
    Write a method that takes a String and return String back with all letters removed
    TEST DATA:
    Time is 8 PM.
    EXPECTED OUTPUT:
    [  8 .]
     */

    public static String removeLetters1(String str){
        String removeLetters = "";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))) removeLetters += str.charAt(i);
        }
        return removeLetters;
    }

    public static String removeLetters2(String str){
        char[] rL = str.toCharArray();
        String removeLetters = "";

        for (int i = 0; i < rL.length; i++) {
            if(!Character.isLetter(rL[i])) removeLetters += rL[i];
        }
        return removeLetters;
    }

    public static String removeLetters3(String str){
        char[] array = str.toCharArray();
        String rL = "";
        for (char c : array) {
            if(!Character.isLetter(c)) rL += c;
        }
        return rL;
    }

    /* Question 8
    Write a method that takes a String and return String back with all specials removed
    TEST DATA:
    The price = 100.50$
    EXPECTED OUTPUT:
    The price  10050
     */

    public static String rS1(String str){
        return str.replaceAll("[^0-9A-Za-z ]", "");
    }

    public static String rS2(String str){
        String remove = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetterOrDigit(str.charAt(i)) || Character.isWhitespace(str.charAt(i))) remove += str.charAt(i);
        }
        return remove;
    }

    public static String rS3(String str){
        char[] rS = str.toCharArray();
        String s = "";
        for (char r : rS) {
            if(Character.isLetterOrDigit(r) || Character.isWhitespace(r)) s += r;
        }
        return s;
    }

    /* Question 9
    Write a method that takes a String and return String back with all vowels removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    Hll Wrld!
     */

    public static String removeVowels1(String str){
        String remove = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'&& str.charAt(i) != 'o'&& str.charAt(i) != 'u'
                    && str.charAt(i) != 'A'&& str.charAt(i) != 'E'&& str.charAt(i) != 'I'&& str.charAt(i) != 'O' && str.charAt(i) != 'U') remove += str.charAt(i);
        }
        return remove;
    }

    public static String removeVowels2(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static String removeVowels3(String str){
        char[] s = str.toCharArray();
        String s1 = "";
        for (int i = 0; i < s.length; i++) {
            if(s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u' &&
                    s[i] != 'A' && s[i] != 'E' && s[i] != 'I' && s[i] != 'o' && s[i] != 'u') s1 += s[i];
        }
        return s1;
    }

    /* Question 10
    Write a method that takes a String and return String back with all consonants
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    eo o!
     */

    public static String consonants1(String str){
        return str.replaceAll("[A-Za-z&&[^AEIOUaeiou]]", "");
    }

    public static String consonants2(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o'||
                    str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E'|| str.charAt(i) == 'I'||
                    str.charAt(i) == 'O'|| str.charAt(i) == 'U' || str.charAt(i) >= 32 && str.charAt(i) <= 64) s += str.charAt(i);
        }
        return s;
    }

    /* Question 11
    Write a method that takes a String and return String back with all uppercase letters removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    ello orld!
     */

    public static String removeUpper1(String str){
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isUpperCase(str.charAt(i))) s += str.charAt(i);
        }
        return s;
    }

    public static String removeUpper2(String str){
        char[] s1 = str.toCharArray();
        String s = "";

        for (char c : s1) {
            if(!Character.isUpperCase(c)) s += c;
        }
        return s;
    }

    public static String removeUpper3(String str){
        char[] c = str.toCharArray();
        String s = "";

        for (int i = 0; i < c.length; i++) {
            if(!Character.isUpperCase(c[i])) s += c[i];
        }
        return s;
    }

    /* Question 12
    Write a method that takes a String and return String back with all uppercase letters removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    H W!
     */

    public static String upper1(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)) || Character.isWhitespace(str.charAt(i)) || !Character.isLetterOrDigit(str.charAt(i))) s += str.charAt(i);
        }
        return s;
    }

    public static String upper2(String str){
        return str.replaceAll("[a-z]", "");
    }

    public static String upper3(String str){
        char[] s = str.toCharArray();
        String s1 = "";

        for (int i = 0; i < s.length; i++) {
            if(!Character.isLetterOrDigit(s[i]) || Character.isUpperCase(s[i])) s1 += s[i];
        }
        return s1;
    }

    /* Question 13
    Write a method that takes a positive int argument and prints all the numbers from 1 to given number
    TEST DATA:
    5
    EXPECTED OUTPUT:
    1
    2
    3
    4
    5
     */

    public static void print1(int a){
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }

    /* Question 14
    Write a method that takes a positive int argument and prints all the even numbers from 1 to given number
    TEST DATA:
    10
    EXPECTED OUTPUT:
    2
    4
    6
    8
    10
     */

    public static void evenNumbers(int a){
        for (int i = 1; i <= a; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }

    /* Question 15
    Write a method that takes a positive int argument and prints all the odd numbers from 1 to given number
    TEST DATA:
    9
    EXPECTED OUTPUT:
    1
    3
    5
    7
    9
     */

    public static void oddNumber(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }

    /* Question 16
    Write a method that takes a positive int argument and prints all the numbers from 1 to given number
    However, it prints “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5,
    and “FizzBuzz” for the numbers divided by both 3 and 5
    TEST DATA:
    15
    EXPECTED OUTPUT:
    1
    2
    Fizz
    4
    Buzz
    Fizz
    7
    8
    Fizz
    Buzz
    11
    Fizz
    13
    14
    FizzBuzz
     */

    public static void FizzBuzz(int a){
        for (int i = 1; i <= a; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /* Question 17
    Write a method that takes an int array argument and returns the sum of all int elements
    TEST DATA:
    [0, -5, 3, 5, 4]
    EXPECTED OUTPUT:
    7
     */

    public static int sum1(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum2(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }









    /* Question 18
    Write a method that takes an int array argument and returns the product of all int elements
    TEST DATA:
    [3, 5, 4]
    EXPECTED OUTPUT:
    60
     */









    /* Question 19
    Write a method that takes an int array argument and returns the average of all int elements
    TEST DATA:
    [3, 5, 4, 0, -2]
    EXPECTED OUTPUT:
    2
     */











    /* Question 20
    Write a method that takes an int array argument and returns the count of zeros
    TEST DATA:
    [3, 5, 4, 0, 0]
    EXPECTED OUTPUT:
    2
     */











    /* Question 21
    Write a method that takes an int array argument and returns the count of positive numbers
    TEST DATA:
    [3, 5, 4, 0, -2]
    EXPECTED OUTPUT:
    3
     */











    /* Question 22
    Write a method that takes an int array argument and returns the count of negative numbers
    TEST DATA:
    [-3, 5, 4, 0, -2]
    EXPECTED OUTPUT:
    2
     */











    /* Question 23
    Write a method that takes an int array argument and returns the count of numbers greater than 10
    TEST DATA:
    [-3, 15, 44, 0, -2]
    EXPECTED OUTPUT:
    2
     */











    /* Question 24
    Write a method that takes an int array argument and returns the count of prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    NOTE: The smallest prime number is 2
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    TEST DATA:
    [-3, 5, 4, 0, 11]
    EXPECTED OUTPUT:
    2
     */











    /* Question 25
    Write a method that takes an int array argument and returns the count of even numbers
    TEST DATA:
    [-3, 5, 4, 0, -2]
    EXPECTED OUTPUT:
    3
     */











    /* Question 26
    Write a method that takes an int array argument and returns the count of odd numbers
    TEST DATA:
    [-3, 5, 4, 0, -2]
    EXPECTED OUTPUT:
    2
     */











    /* Question 27
    Write a method that takes an int array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    [0, 5, 4, 0, 0]
    EXPECTED OUTPUT:
    [0, 4, 5]
     */











    /* Question 28
    Write a method that takes a String array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]
    EXPECTED OUTPUT:
    [bar, 123, foo]
     */











    /* Question 29
    Write a method that takes a String argument and returns a boolean. It will return true if given String is palindrome, and false otherwise
    Palindrome: it is a word that reads the same backward as forward
    Ex: kayak, civic, madam
    TEST DATA:
    Hello
    EXPECTED OUTPUT:
    false
    TEST DATA:
    civic
    EXPECTED OUTPUT:
    true
     */











    /* Question 30
    Write a method that takes a String argument and returns a boolean. It will return true if given String is palindrome, and false otherwise
    Anagram: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
    Ex: listen-silent | cinema-iceman
    TEST DATA:
    Hello, World
    EXPECTED OUTPUT:
    false
    TEST DATA:
    cinema, iceman
    EXPECTED OUTPUT:
    true
     */











    /* Question 31
    Write a method that takes an Integer ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    [0, 5, 4, 0, 0]
    EXPECTED OUTPUT:
    [0, 4, 5]
     */











    /* Question 32
    Write a method that takes a String ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]
    EXPECTED OUTPUT:
    [bar, 123, foo]
     */











    /* Question 33
    Write method that takes an int argument and prints the Fibonacci series of given number
    DEFINITION: Fibonacci is a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
    The simplest is the series 0, 1, 1, 2, 3, 5, 8, 13, 21
    TEST DATA:
    8
    EXPECTED OUTPUT:
    0
    1
    1
    2
    3
    5
    8
    13
     */











    /* Question 34
    Write a method that takes a String argument and returns the count of spaces as an int
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    2
     */











    /* Question 35
    Write a method that takes a String argument and returns the count of letters as an int
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    10
     */











    /* Question 36
    Write a method that takes a String argument and returns the count of digits as an int
    TEST DATA:
    Happy 2022!
    EXPECTED OUTPUT:
    4
     */











    /* Question 37
    Write a method that takes a String argument and returns the count of specials as an int
    TEST DATA:
    The date was 10/10/1990
    EXPECTED OUTPUT:
    2
     */











    /* Question 38
    Write a method that takes a String argument and returns the count of vowels as an int
    TEST DATA:
    I like Java
    EXPECTED OUTPUT:
    5
     */











    /* Question 39
    Write a method that takes a String argument and returns the count of consonants as an int
    TEST DATA:
    I like Java
    EXPECTED OUTPUT:
    6
     */











    /* Question 40
    Write a method that takes a String argument and returns the count of upper cases as an int
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    1
     */











    /* Question 41
    Write a method that takes a String argument and returns the count of lower cases as an int
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    8
     */











    /* Question 42
    Write a method that takes a String as argument and returns the count of words as an int
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    3
     */











    /* Question 43
    Write a method that takes a String as argument and returns the String back with all extra spaces removed
    TEST DATA:
    Java    is    fun
    EXPECTED OUTPUT:
    Java is fun
     */











    /* Question 44
    Write a method that takes a String as argument and returns the String back with each word reversed in the same place
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    avaJ si nuf
     */











    /* Question 45
    Write a method that takes an int argument and returns number’s factorial.
    Factorial is the operation of multiplying any natural number with all the natural numbers that are smaller than it
    Ex: 4! = 4*3*2*1, so the result is 24
    NOTE: 0! = 1
    NOTE: Negative numbers are not considered in this method
    TEST DATA:
    5
    EXPECTED OUTPUT:
    120
     */











    /* Question 46
    Write a method that takes an int array argument and returns the array back with all elements replaced with their factorial.
    Factorial is the operation of multiplying any natural number with all the natural numbers that are smaller than it
    Ex: 4! = 4*3*2*1, so the result is 24
    NOTE: 0! = 1
    NOTE: Negative numbers are not considered in this method
    TEST DATA:
    [0, 5, 4, 1, 3, 2]
    EXPECTED OUTPUT:
    [1, 120, 24, 1, 6, 2]
     */











    /* Question 47
    Write a method that takes an int array argument and returns the max value as an int
    NOTE: Assume length of the array is always more than zero
    TEST DATA:
    [-5, 4, 1, 10, 2]
    EXPECTED OUTPUT:
    10
     */











    /* Question 48
    Write a method that takes an int array argument and returns the min value as an int
    NOTE: Assume length of the array is always more than zero
    TEST DATA:
    [-5, 4, 1, 10, 2]
    EXPECTED OUTPUT:
    -5
     */











    /* Question 49
    Write a method that takes an int array argument and returns the second max value as an int
    NOTE: Assume length of the array is always more than one
    TEST DATA:
    [-5, 4, 1, 10, 2]
    EXPECTED OUTPUT:
    4
     */












    /* Question 50
    Write a method that takes an int array argument and returns the second min value as an int
    NOTE: Assume length of the array is always more than one
    TEST DATA:
    [-5, 4, 1, 10, 2]
    EXPECTED OUTPUT:
    1
     */
}