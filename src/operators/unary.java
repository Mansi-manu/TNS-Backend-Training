package operators;

public class unary {

	public static void main(String[] args) {
		
        // Unary operators (++ , --)
        int s= 16;
        // Post increment
        System.out.println("The post increment value is " + s++); // prints 16, then increments
        System.out.println("After post increment, d = " + s); // prints 17
        // Pre increment
        System.out.println("The pre increment value is " + (++s)); // increments then prints (18)
        System.out.println("Current value of d = " + s); // 18

        // Post decrement
        System.out.println("The post decrement value is " + s--); // prints 18, then decrements
        System.out.println("After post decrement, d = " + s); // 17

        //Pre decrement
        System.out.println("The pre decrement value is " + (--s)); // decrements then prints (16)
        System.out.println("Current value of d = " + s); // 16


	}

}
