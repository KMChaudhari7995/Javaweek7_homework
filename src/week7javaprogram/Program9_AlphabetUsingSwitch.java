package week7javaprogram;
/*
Input any alphabet from “A " to “F” and print their city name accordingly (use switch) if
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program9_AlphabetUsingSwitch {
    public static void main(String[] args) {
        Program9_AlphabetUsingSwitch number = new Program9_AlphabetUsingSwitch();
        number.alphabet();
    }
    public void alphabet() {
        Scanner scan = new Scanner(System.in);                                  //scanner calling
        System.out.println("Enter one Alphabet from 'A' to 'F': ");             //print statement
        char ch = scan.next().charAt(0);                                        // value store
        switch (ch) {                                                           // switch case
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bath");
                break;
            case 'C':
                System.out.println("Coventry");
                break;
            case 'D':
                System.out.println("Denmark");
                break;
            case 'E':
                System.out.println("Edmond");
                break;
            case 'F':
                System.out.println("Florida");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        scan.close();

    }

}


