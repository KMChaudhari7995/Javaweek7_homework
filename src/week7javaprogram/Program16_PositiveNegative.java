package week7javaprogram;
/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

import java.util.Scanner;

public class Program16_PositiveNegative {
    public static void main(String[] args) {

        positiveNegative();                             //static method calling
    }

    public static void positiveNegative() {                                 //static method declaration
        Scanner scan = new Scanner(System.in);                              //scanner use
        System.out.println("Enter any number:");                            //Print statement
        int number = scan.nextInt();                                        //value store
        if (number > 0) {                                                   //if-else condition
            System.out.println(number + " is Positive number ");
        } else if (number < 0) {
            System.out.println(number + " is Negative number ");
        } else {
            System.out.println("Zero Number");
        }
        scan.close();
    }
}
