import org.junit.Test;

public class BagsTest {

	@Test
	public void test() {
		Laptop lappy = new Laptop();
		lappy.brand = "Apple";
		lappy.cpuType = "Intel";

		// laptop memory
		Memory mem = new Memory();
		mem.speed = 133.3;
		mem.size = 1024;
		lappy.memory = mem;

		// laptop disk
		Disk disk = new Disk();
		disk.capacity = 256;
		disk.speed = 7200;
		disk.type = "SATA";
		lappy.disk = disk;

		// laptop applications.... TODO

		// laptop bag
		LaptopBag bag = new LaptopBag();
		bag.brand = "Mission Workshop";
		bag.capacity = 10.0;
		bag.color = "Black";
		bag.open = true;
		bag.contents = lappy;

		System.out.println(bag);
	}

}
