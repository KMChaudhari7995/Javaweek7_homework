package week7javaprogram;
/*
Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Program6_EvenOdd {
    public static void main(String[] args) {
        Program6_EvenOdd num = new Program6_EvenOdd();
        num.isOddEven();

    }

    public void isOddEven(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:  ");
        int number = scan.nextInt();
        if (number % 2 == 0) {                                                  // use ternary operator
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }
        scan.close();








    }
}

