package week7javaprogram;
/*
Write a Java program which input any number between1 to 7 and it print The Days
name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Program13_DaysSwitch {
    public static void main(String[] args) {

        Program13_DaysSwitch number = new Program13_DaysSwitch();
        number.numberDays();

    }

    public void numberDays() {
        Scanner scan = new Scanner(System.in);                                    //scanner use
        System.out.println("Enter number between 1 to 7:");                     //print statement
        int num = scan.nextInt();

        switch (num) {                                                      //switch- case
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7");
        }
        scan.close();
    }
}
