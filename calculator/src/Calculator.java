import java.util.Stack;

public class Calculator {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
		} else {
			// the expression is the first command-line argument
			String expression = args[0];

			// split the expression into tokens, using space as the delimiter
			String[] tokens = expression.split(" ");

			// initialize an empty stack, and loop through all the tokens
			Stack<Integer> stack = new Stack<Integer>();
			for (String token : tokens) {

				try {
					// try to handle the token as a number ...
					int number = Integer.parseInt(token);
					stack.push(number);
				} catch (NumberFormatException e) {

					// if the token wasn't a number, try to handle it as an operator ...
					if (token.equals("+")) {
						int rhs = stack.pop(), lhs = stack.pop();
						stack.push(lhs + rhs);
					} else if (token.equals("-")) {
						int rhs = stack.pop(), lhs = stack.pop();
						stack.push(lhs - rhs);
					} else if (token.equals("*")) {
						int rhs = stack.pop(), lhs = stack.pop();
						stack.push(lhs * rhs);
					} else if (token.equals("/")) {
						int rhs = stack.pop(), lhs = stack.pop();
						stack.push(lhs / rhs);
					} else {
						throw new IllegalArgumentException("bad expression");
					}
				}
			}
			
			System.out.println(stack.pop());
		}

	}

}
