package Loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        // while loop to count digits
        while (temp != 0) {
            temp = temp / 10;   // remove last digit
            count++;            // increase count
        }

        System.out.println("The number " + n + " has " + count + " digits.");

        sc.close();
    }
}
