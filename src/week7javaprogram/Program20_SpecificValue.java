package week7javaprogram;
/*
 Write a Java program to test if an array contains a specific value
 */

public class Program20_SpecificValue {
    public static void main(String[] args) {

        int myArray [] = {10,20,30,40,50}; //declaring array

        arraySpecific(myArray, 80);
        System.out.println("Specific item is: "+arraySpecific(myArray ,80)); //output

    }

    public static boolean arraySpecific(int a[],int b) { //static method with parameter
        for (int i : a) {
            if (b == i) {
                return true;        //return value
            }

        }
        return false;
    }
}

