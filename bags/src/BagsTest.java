import org.junit.Test;

public class BagsTest {

	@Test
	public void test() {
		Laptop lappy = new Laptop();

		// initialize some memory
		Memory mem = new Memory();
		mem.speed = 133.3;
		mem.size = 1024;

		// put the memory in the laptop
		lappy.memory = mem;
	}

}
