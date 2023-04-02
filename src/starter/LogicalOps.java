package starter;

import java.util.Scanner;

public class LogicalOps {

	public static void main(String[] args) {
		// Just like JS
		// && = AND, || = OR ! = NOT

		int temp = 25;

		if (temp > 30) {
			System.out.println("It's hot outside");
		} else if (temp >= 20 && temp <= 30) {
			System.out.println("It's between warm & hot outside");
		} else {
			System.out.println("It's cold outside!");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("You're playing DOTA 2. Press Q or q to quit.");
		String response = scanner.next();

		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit!");
		} else {
			System.out.println("You're still playing!");
		}
		scanner.close();
        //Opposite with ! operator.
//		if (!response.equals("q") && !response.equals("Q")) {
//			System.out.println("You're still playing!");
//		} else {
//			System.out.println("You quit!");
//		}
	}
}
