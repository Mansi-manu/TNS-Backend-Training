package Switch;
import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1–7): ");
        int day = sc.nextInt();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        // Creating object for SwitchStatement class
        SwitchStatement ss = new SwitchStatement(day, op, num1, num2);

        // Calling both switch examples
        ss.showDay();
        ss.performOperation();

        sc.close();
    }
}
