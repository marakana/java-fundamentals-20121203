import java.util.Stack;

public class Calculator {

	// handle a number
	public static boolean handleNumber(String token, Stack<Integer> stack) {
		try {
			int number = Integer.parseInt(token);
			stack.push(number);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// handle an operator
	public static boolean handleOperator(String token, Stack<Integer> stack) {
		if (token.equals("+")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs + rhs);
			return true;
		}

		if (token.equals("-")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs - rhs);
			return true;
		}

		if (token.equals("*")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs * rhs);
			return true;
		}

		if (token.equals("/")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs / rhs);
			return true;
		}

		return false;
	}

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
				if (!handleNumber(token, stack) && !handleOperator(token, stack)) {
					throw new IllegalArgumentException("garbage in expression");
				}
			}

			System.out.println(stack.pop());
		}

	}

}
