package week7javaprogram;

import java.util.Scanner;

/*
Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator
 */
public class Program1_OddEven {

    public static void main(String[] args) {
        oddOrEven(); // calling a static method into main method
    }

    public static void oddOrEven() {
        Scanner scan = new Scanner(System.in); //  Scanner
        System.out.println("Enter the Integer value: ");
        int value = scan.nextInt();
        //Logic for odd and even
//        if(value%2==0)
//        {
//            System.out.println(value + " Number is even"); //output if condition is true
//        }
//        else
//        {
//            System.out.println(value + " Number is odd");//output if condition is false
//        }
        String result = value % 2 == 0 ? "even" : "Odd";
        System.out.println(value + " number is  " + result);
        scan.close();
    }
}


