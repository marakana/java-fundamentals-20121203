/**
 * Hello is a class that greets the world.
 * 
 * @author dr
 * @since 1.0
 */
public class Hello {

	/**
	 * The main method is the special method that the JVM calls when the program
	 * is run.
	 * 
	 * @param args
	 *            the list of command-line arguments that you ran the program
	 *            with
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			String name = args[0];
			System.out.println("Hello, " + name);
		} else {
			System.out.println("Hello, Nobody.");
		}
	}

	// example of case statements with intentionally missing breaks
	public static void printDaysInMonth(int num) {
		int days;
		switch (num) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		default:
			throw new IllegalArgumentException();
		}
		System.out.println(days);
	}
}
