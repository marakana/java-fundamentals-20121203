import org.junit.Test;

public class BagsTest {

	@Test
	public void test() {
		Laptop lappy = new Laptop();
		lappy.setBrand("Apple");
		lappy.setCpuType("Intel");

		// laptop memory
		Memory mem = new Memory();
		mem.setSpeed(133.3);
		mem.setSize(1024);
		lappy.setMemory(mem);

		// laptop disk
		Disk disk = new Disk();
		disk.setCapacity(256);
		disk.setSpeed(7200);
		disk.setType("SATA");
		lappy.setDisk(disk);

		// laptop applications.... TODO

		// laptop bag
		LaptopBag bag = new LaptopBag();
		bag.setBrand("Mission Workshop");
		bag.setCapacity(10.0);
		bag.setColor("Black");
		bag.setOpen(true);
		
		bag.setContents(lappy);

		System.out.println(bag);
	}

}
