import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;


public class CalculatorTest {

	/*
	 * TODO:
	 * 
	 * handleNumber:
	 *   - if you give it a number, then it should push and return true
	 *   - if you give it a non-number, then it shouldn't touch the stack, and return false
	 *   
	 * handleOperator:
	 *   - if you give it an operator, it should pop arguments, perform op, push and return true
	 *   - if you give it a non-operator, then it shouldn't touch the stack, and return false
	 * 
	 * calculate:
	 *   - expect an IllegalArgumentException if there was garbage in the expression
	 */

	@Test
	public void handleNumberMustHandleNumbers() {
		Stack<Integer> stack = new Stack<Integer>();
		assertTrue(Calculator.handleNumber("42", stack));
		assertEquals(42, (int) stack.peek());
	}

	@Test
	public void onePlusOneMustEqualTwo() {
		assertEquals(2, Calculator.calculate("1 1 +"));
	}

}
