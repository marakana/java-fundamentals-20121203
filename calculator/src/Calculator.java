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
				System.out.println("token is " + token);

				//   if you see a number: push it on the stack
				//   if you see an operator:
				//     - pop two numbers off the stack
				//     - perform the operation
				//     - push the result back on the stack
			}
			
			// step 4: print whatever number is left on the stack
		}

	}

}
