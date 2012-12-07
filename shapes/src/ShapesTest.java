import static org.junit.Assert.*;

import org.junit.Test;


public class ShapesTest {

	@Test
	public void rectangleConstructorMustWork() {
		Rectangle r = new Rectangle(2, 3);
		assertEquals(2, r.getWidth());
		assertEquals(3, r.getHeight());
	}

	@Test
	public void squareConstructorMustWork() {
		Square s = new Square(5);
		assertEquals(5, s.getWidth());
		assertEquals(5, s.getHeight());
	}

}
