public class Calculator {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
		} else {
			String expression = args[0];
			
			// step 2: split the string into "tokens," using spaces as delimiters

			// step 3: loop through all of the tokens
			//   if you see a number: push it on the stack
			//   if you see an operator:
			//     - pop two numbers off the stack
			//     - perform the operation
			//     - push the result back on the stack
			
			// step 4: print whatever number is left on the stack
		}

	}

}
