import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		// DO WHILE tutorial:

		Scanner input = new Scanner(System.in);

		// do while always runs at least once.
		// this syntax makes more sense than C#.
		// it's actually "do... while"

		int value;

		do {
			System.out.println("Enter a number: ");
			value = input.nextInt();
		} while (value != 5);

		// as soon as condition in while is true
		// the do loop stops and the program continues with the next line:

		System.out.println("You got a match!");

		// SWITCH STATEMENTS tutorial:

		Scanner input2 = new Scanner(System.in);

		System.out.println("Please enter a command.");
		String text = input2.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped.");
			break;
		// you can have as many cases as you want
		default:
			System.out.println("Command not recognized.");
		}

	}
}
