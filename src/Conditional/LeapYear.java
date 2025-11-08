package Conditional;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println(" Leap Year");

        // A leap year is divisible by 4 but not by 100, unless also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }
}
