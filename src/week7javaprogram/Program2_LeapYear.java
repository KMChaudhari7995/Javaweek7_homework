package week7javaprogram;
/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */

import java.util.Scanner;

public class Program2_LeapYear {
    public static void main(String[] args) {
        Program2_LeapYear leapYear = new Program2_LeapYear();                       //instance method calling
        leapYear.isLeapYear();
    }

    public void isLeapYear() {
        Scanner scan = new Scanner(System.in);                                  // scanner object
        System.out.println("Enter the Year ");
        int year = scan.nextInt();                                              //store value
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {            //if - else statement
            System.out.println(year + " is a Leap year ");
        } else {
            System.out.println(year + " is not a Leap year ");
        }
        scan.close();

    }
}
