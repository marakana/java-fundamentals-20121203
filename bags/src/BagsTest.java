import org.junit.Test;

public class BagsTest {

	@Test
	public void test() {
		Memory mem = new Memory(133.3, 1024);
		Disk disk = new Disk("SATA", 7200, 256);
		Laptop lappy = new Laptop("Apple", "Intel", mem, disk);

		// laptop applications.... TODO

		LaptopBag bag = new LaptopBag("Mission Workshop", 10.0, "Black");
		bag.setOpen(true);
		bag.setContents(lappy);

		System.out.println(bag);
	}

}
