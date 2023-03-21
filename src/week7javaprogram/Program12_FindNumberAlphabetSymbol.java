package week7javaprogram;
/*
. Write a program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Program12_FindNumberAlphabetSymbol {
    public static void main(String[] args) {
        Program12_FindNumberAlphabetSymbol input = new Program12_FindNumberAlphabetSymbol(); //instance method calling
        input.findValue();
    }

    public void findValue() {                                               //instance method
        Scanner scan = new Scanner(System.in);                                  //scanner use
        System.out.println("Enter the number or Alphabet or Symbol :");         //print statement
        char value = scan.next().charAt(0);
        if ((value >= 'A' && value <= 'Z') || (value >= 'a' && value <= 'z')) {
            System.out.println("this is an alphabet");

        } else if (value >= '0' && value <= '9') {
            System.out.println("this is a number");
        } else {
            System.out.println("this is a symbol");
        }
        scan.close();
    }

}

