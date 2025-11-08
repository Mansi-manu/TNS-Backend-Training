package Switch;

import java.util.Scanner;

public class SwitchStatement {

    int dayNumber;
    char operator;
    int a, b;

    // Constructor
    SwitchStatement(int dayNumber, char operator, int a, int b) {
        this.dayNumber = dayNumber;
        this.operator = operator;
        this.a = a;
        this.b = b;
    }

    // Method for day name example
    void showDay() {
        System.out.println("\n SWITCH STATEMENT (DAY EXAMPLE)");

        switch (dayNumber) {
            case 1:
                System.out.println("Day " + dayNumber + " is Monday");
                break;
            case 2:
                System.out.println("Day " + dayNumber + " is Tuesday");
                break;
            case 3:
                System.out.println("Day " + dayNumber + " is Wednesday");
                break;
            case 4:
                System.out.println("Day " + dayNumber + " is Thursday");
                break;
            case 5:
                System.out.println("Day " + dayNumber + " is Friday");
                break;
            case 6:
                System.out.println("Day " + dayNumber + " is Saturday");
                break;
            case 7:
                System.out.println("Day " + dayNumber + " is Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter between 1–7.");
        }
    }

    // Method for arithmetic operation example
    void performOperation() {
        System.out.println("\n SWITCH STATEMENT (OPERATION EXAMPLE)");

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Division: " + (a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default:
                System.out.println("Invalid operator! Use +, -, *, or /");
        }
    }
}
