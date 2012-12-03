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
		// if we have nobody to greet (no command-line arguments)...
		if (args.length == 0) {
			// then just say "hello nobody"
			System.out.println("Hello, Nobody.");
		} else {
			// otherwise, we have some arguments -- some people to greet

			// loop over all of the arguments
			for (int i = 0; i < args.length; i = i + 1) {
				// get the name of the person and greet it
				String name = args[i];
				System.out.println("Hello, " + name);
			}
		}
	}
}
