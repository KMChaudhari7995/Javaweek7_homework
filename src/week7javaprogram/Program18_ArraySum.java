package week7javaprogram;
/*
Write a Java program to sum values of an array
 */

import java.util.Arrays;

public class Program18_ArraySum {
    public static void main(String[] args) {
        Program18_ArraySum value = new Program18_ArraySum(); //instance method calling using object creation
        value.arrayAddition();                                //method calling
    }

    public void arrayAddition()
    {
        int [] number = {4,5,6,10,30};                                  //Array declaration
        int sum = Arrays.stream(number).sum();
        System.out.println("Sum of Array : "+ sum);
    }

}
