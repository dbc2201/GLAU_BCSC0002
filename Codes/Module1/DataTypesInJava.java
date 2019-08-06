/**
 * @author Divyansh Bhardwaj
 * A simple Java program to demonstrate different primitive data types in Java.
 * */
public class DataTypesInJava {
	public static void main(String[] args) {
		/*
		 * Java supports 8 different primitive data types, namely -
		 * 1. byte
		 * 2. short
		 * 3. char
		 * 4. int
		 * 5. long
		 * 6. float
		 * 7. double
		 * 8. boolean
		 * */

		/*
		 * This is how we declare variable of the different primitive types in Java.
		 * */
		byte byteVariable = 0;
		short shortVariable  = 0;
		char charVariable = '\0';
		int intVariable = 0;
		long longVariable = 0L;
		float floatVariable = 0.0f;
		double doubleVariable = 0.0;
		boolean booleanVariable = false;

		/*
		 * We can look at the range of every data type by using the Wrapper Class of that type.
		 * */
		System.out.println("The range of the \"byte\" data type is from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ".");
		System.out.println("The range of the \"short\" data type is from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ".");
		System.out.println("The range of the \"char\" data type is from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE + ".");
		System.out.println("The range of the \"int\" data type is from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ".");
		System.out.println("The range of the \"long\" data type is from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ".");
		System.out.println("The range of the \"float\" data type is from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ".");
		System.out.println("The range of the \"double\" data type is from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ".");

	}
}