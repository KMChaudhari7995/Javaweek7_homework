package week7javaprogram;
/*
Write a java program to print the numbers between1 to 100 which can be divided by 3
and 5 separately
 */

public class Program11_PrintNumber {
    public static void main(String[] args) {
        Program11_PrintNumber divided = new Program11_PrintNumber();           //instance method calling
        divided.dividedThree();
        Program11_PrintNumber divided1 = new Program11_PrintNumber();
        divided1.dividedFive();

    }

    public void dividedThree() {                    //divided 1 to 100 by 3

        System.out.println("Divided by 3 value: ");
        for (int i = 1; i < 100; i++)                                      //for loop
        {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
//        System.out.println("   ");
//        System.out.println("Divided by 5 value: ");
//        for (int i = 1; i < 100; i++) {
//            if (i % 5 == 0)
//                System.out.print( i+ ", ");
//        }

    }

    public void dividedFive()                           //divided  1 to 100 by 5
    {
        System.out.println("   ");
        System.out.println("Divided by 5 value: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print( i+ ", ");
        }
    }
}
