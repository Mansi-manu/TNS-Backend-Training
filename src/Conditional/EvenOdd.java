package Conditional;

import java.util.Scanner;

public class EvenOdd{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Conditional statement
        if (num % 2 == 0) {
            System.out.println(num + " is an EVEN number.");
        } else {
            System.out.println(num + " is an ODD number.");
        }

        sc.close();
    }
}
