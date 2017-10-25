import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int y;
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Learn your squares and cubes!");

			System.out.print("Enter an integer: ");
			while (!scnr.hasNextInt()) {
				System.out.print("Sorry, please enter a number: ");
				scnr.next();
			}
			int x = scnr.nextInt();
			System.out.println("Number       Squared      Cubed");
			System.out.println("=======      =======      ======");

			for (y = 1; y <= x; ++y) {
				System.out.println(y + "            " + y * y + "             " + y * y * y);
			}
			System.out.print("Continue? (y/n): ");
			cont = scnr.next();

		}
		scnr.close();
	}
}
