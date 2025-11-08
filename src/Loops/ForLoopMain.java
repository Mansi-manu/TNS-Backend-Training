package Loops;

import java.util.Scanner;

public class ForLoopMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ForLoop obj = new ForLoop(); // create object of ForLoopPractice class
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println();
        // Execution for multiplication table
        obj.multiplicationTable(num);
        
        // Execution for factorial
        obj.factorial(num);
        
        // Execution for Fibonacci series
        System.out.print("Enter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        obj.fibonacci(terms);
        
        sc.close();
    }
}
