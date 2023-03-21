package week7javaprogram;
/*
Write a Java program to calculate the average value of array elements.
 */

public class Program19_ArrayAverage {
    public static void main(String[] args) {
        average();         //static calling
    }

    public static void average() {
        int avg[] = {10, 15, 20, 25, 30, 35, 40};           //array declaration
        int ans = 0;
        for (int i = 0; i < avg.length; i++)
        {
            ans = ans + avg[i]; // addition of array element until the array length
        }
        double average1 = ans / avg.length; //average calculation
        System.out.println("Average value of the Array : " + average1);  //output the average of array
    }
}
