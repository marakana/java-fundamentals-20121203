public class Calculator {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
		} else {
			// the expression is the first command-line argument
			String expression = args[0];

			// split the expression into tokens, using space as the delimiter
			String[] tokens = expression.split(" ");

			// loop through all the tokens
			for (String token : tokens) {

				// distinguish numbers from non-numbers
				try {
					int number = Integer.parseInt(token);
					System.out.println(number + " is a number token");
					//   if you see a number: push it on the stack
				} catch (NumberFormatException e) {
					
					if (token.equals("+")) {
						System.out.println("+ is an operator");
					} else if (token.equals("-")) {
						System.out.println("- is an operator");
					} else if (token.equals("*")) {
						System.out.println("* is an operator");
					} else if (token.equals("/")) {
						System.out.println("/ is an operator");
					} else {
						System.out.println(token + " is garbage");
					}

					//   if you see an operator:
					//     - pop two numbers off the stack
					//     - perform the operation
					//     - push the result back on the stack
				}
			}
			
			// step 4: print whatever number is left on the stack
		}

	}

}
