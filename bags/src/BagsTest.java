import static org.junit.Assert.*;

import org.junit.Test;

public class BagsTest {

	@Test
	public void test() {
		Memory mem = new Memory(133.3, 1024);
		Disk disk = new Disk("SATA", 7200, 256);
		Laptop lappy = new Laptop("Apple", "Intel", mem, disk);

		Memory mem2 = new Memory(133.3, 1024);
		Disk disk2 = new Disk("SATA", 7200, 256);
		Laptop lappy2 = new Laptop("Apple", "Intel", mem2, disk2);

		assertFalse(lappy == lappy2);
		assertTrue(lappy.equals(lappy2));

		// laptop applications.... TODO

		LaptopBag bag = new LaptopBag("Mission Workshop", 10.0, "Black");
		bag.setOpen(true);
		bag.setContents(lappy);

		System.out.println(bag);
	}

//	@Test
//	public void whatever() {
//		Computer c = new Computer();
//	}
}
