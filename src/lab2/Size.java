package lab2;

import java.util.Scanner;

public class Size {
	public static void main(String[] args) {
		// Declare variables.
		Scanner input = new Scanner(System.in);
		double length, width, height, area, perimeter, volume;
		String cont = "";

		// Greeting.
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		// Get user input.
		do {
			System.out.println("Enter length: ");
			input.hasNextDouble();
			length = input.nextDouble();

			System.out.println("Enter width: ");
			input.hasNextDouble();
			width = input.nextDouble();

			System.out.println("Enter height: ");
			input.hasNextDouble();
			height = input.nextDouble();

			// Calculate, then display display Area, Perimeter and Volume.
			area = length * width;
			System.out.println("Area: " + area);

			perimeter = (length * 2) + (width * 2);
			System.out.println("Perimeter: " + perimeter);

			volume = length * width * height;
			System.out.println("Volume: " + volume);

			// Ask to continue.
			System.out.println("Continue? (y/n): ");
			input.nextLine();
			cont = input.nextLine();

		} while (cont.equalsIgnoreCase("y"));
		input.close();
	}
}

/* Sources:
 * https://www.varsitytutors.com/hotmath/hotmath_help/topics/perimeter-area-volume
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 */