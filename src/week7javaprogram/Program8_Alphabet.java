package week7javaprogram;
/*
Input any alphabet from “A " to “F” and print their city name accordingly (use if else)
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8_Alphabet {
    public static void main(String[] args) {
        alphabet();                                                                 //Static method

    }
    public static void alphabet()
    {

        Scanner scan = new Scanner(System.in);                              //scanner call
        System.out.println("Enter any Alphabet from A to F : ");
        char alpha1 = scan.next().charAt(0);

        if (alpha1 == 'A' || alpha1 == 'a'){
            System.out.println("Ahmedabad");
        }
        else if (alpha1 == 'B' || alpha1 == 'b')
        {
            System.out.println("Birmingham");
        }
        else if (alpha1 == 'B' || alpha1 == 'b')
        {
            System.out.println("Birmingham");
        }
        else if (alpha1 == 'C' || alpha1 == 'c')
        {
            System.out.println("Canada");
        }
        else if (alpha1 == 'D' || alpha1 == 'd')
        {
            System.out.println("Delhi");
        }
        else if (alpha1 == 'E' || alpha1 == 'e')
        {
            System.out.println("Edmond");
        }
        else if (alpha1 == 'F' || alpha1 == 'f')
        {
            System.out.println("florida");
        }
        else
        {
            System.out.println("Invalid Entry");
        }

        scan.close();
    }
}
