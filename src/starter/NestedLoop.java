package starter;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows;
		int col;
		String symbol;

		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		col = scanner.nextInt();
		System.out.println("Choose the symbol for the representation: ");
		symbol = scanner.next();

		for (int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j = 1; j <= col; j++) {
				System.out.print(symbol);
			}
		}

		scanner.close();
	}

}
