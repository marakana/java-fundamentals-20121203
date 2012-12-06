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
		
		Operator op;
		if (token.equals("+")) {
			op = new Add();
		} else if (token.equals("-")) {
			op = new Subtract();
		} else if (token.equals("*")) {
			op = new Multiply();
		} else if (token.equals("/")) {
			op = new Divide();
		} else {
			return false;
		}

		int rhs = stack.pop(), lhs = stack.pop();
		stack.push(op.operate(lhs, rhs));
		return true;
	}

	public static int calculate(String expression) {
		// split the expression into tokens, using space as the delimiter
		String[] tokens = expression.split(" ");

		// initialize an empty stack, and loop through all the tokens
		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			if (!handleNumber(token, stack) && !handleOperator(token, stack)) {
				throw new IllegalArgumentException("garbage in expression");
			}
		}

		// the result is the last number remaining on the stack
		return stack.pop();
	}

	public static void main(String[] args) {

		// make sure we have exactly one command-line argument
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}

		System.out.println(calculate(args[0]));

	}

}
