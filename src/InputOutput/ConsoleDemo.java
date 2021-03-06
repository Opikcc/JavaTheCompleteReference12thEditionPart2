package InputOutput;

//Demonstrate Console.
import java.io.*;

class ConsoleDemo {
	public static void main(String[] args) {
		String str;
		Console con;

		// Obtain a reference to the console.
		con = System.console();
		// If no console available, exit.
		if (con == null) {
			System.out.println("No console available.");
			return;
		}

		// Read a string and then display it.
		str = con.readLine("Enter a string: ");
		con.printf("Here is your string: %s\n", str);
	}
}
