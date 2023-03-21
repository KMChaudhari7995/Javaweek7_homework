package week7javaprogram;
/*
Write a Java program to sort a numeric array and a string array
 */

import java.util.Arrays;

public class Program17_ArrayString {
    public static void main(String[] args) {

        Program17_ArrayString value = new Program17_ArrayString();          //object creation for instance method
        value.numberArraySorting();                                           //instance method calling for numberArray
        System.out.println("     ");
        value.stringArraySorting();                                         //instance method calling for String Array
    }
    public void numberArraySorting() {
        int a[] = {10, 5, 20, 15, 30, 25, 40, 35};                                  //numeric array declaration
        System.out.println("Before sorting value : " + Arrays.toString(a));         //print statement with toString predefined method
        Arrays.sort(a);
        System.out.println("Numeric array after sorting " + Arrays.toString(a));

    }
    public void stringArraySorting()
    {
        String names [] = {"Khushi","Mishu","Akta","Shinu","Hiral","Naina"};            //String Array declaration
        System.out.println("Before sorting Names :"+Arrays.toString(names));
        Arrays.sort(names);                                                         //string sorting
        System.out.println("String array after sorting :"+Arrays.toString(names));
    }
}
