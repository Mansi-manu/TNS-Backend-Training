package DataTypes;

public class DataTypes {

	    // Instance variables of all primitive data types
	    byte age = 25;
	    short year = 2025;
	    int population = 1400000000; // population count
	    long distanceToSun = 149_600_000_000L; // distance from Earth to Sun in meters
	    float temperature = 36.6f; // average human body temperature
	    double piValue = 3.141592653589793;
	    boolean isJavaFun = true;
	    char grade = 'A';

	    // Method to display all data type values
	    void showData() {
	        System.out.println("=== Java Primitive Data Types Example ===");
	        System.out.println("byte (age): " + age);
	        System.out.println("short (year): " + year);
	        System.out.println("int (population): " + population);
	        System.out.println("long (distance to Sun in meters): " + distanceToSun);
	        System.out.println("float (temperature): " + temperature);
	        System.out.println("double (pi value): " + piValue);
	        System.out.println("boolean (is Java fun?): " + isJavaFun);
	        System.out.println("char (grade): " + grade);
	    }
	}


