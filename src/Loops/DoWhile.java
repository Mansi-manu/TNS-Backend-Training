package Loops;

import java.util.Scanner;

public class DoWhile{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int temp = number;
        
        // Do-while loop to reverse the number
        do {
            int digit = temp % 10;       // Get last digit
            reversed = reversed * 10 + digit; // Build reversed number
            temp /= 10;                  // Remove last digit
        } while (temp != 0);
        
        System.out.println("Reversed number: " + reversed);
        
        sc.close();
    }
}
