import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String cont = "y";
		System.out.println("Learn your squares and cubes!");

		while (cont.equalsIgnoreCase("y")) {

			System.out.print("Enter an integer: ");
			while (!scnr.hasNextInt()) {
				System.out.print("Sorry, please enter a number: ");
				scnr.next();
			}
			int x = scnr.nextInt();
			System.out.printf("%-10s %-10s %-10s \n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s \n", "=======", "=======", "======");

			for (int y = 1; y <= x; ++y) {
				System.out.printf("%-10s %-10s %-10s \n", y, y * y, y * y * y);

			}
			System.out.print("Continue? (y/n): ");

			cont = scnr.next();

		}
		System.out.println("Goodbye.");
		scnr.close();
	}
}
