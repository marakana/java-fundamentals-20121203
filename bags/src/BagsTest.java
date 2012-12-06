import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class BagsTest {

	@Test
	public void test() {
		
		// create a collection of storage and insert a memory module
		Collection<Storage> storage = new ArrayList<Storage>();
		storage.add(new Memory(2048));

		// create a list of disks to build a RAID array
		List<Disk> disks = new ArrayList<Disk>();
		disks.add(new SSD(1, 1, 1));
		disks.add(new SSD(1, 1, 1));
		
		// add the new RAID array to the storage collection
		storage.add(new RAID(disks));

		// build the laptop using the storage
		Laptop laptop = new Laptop("Apple", "Intel", storage);

		// install some applications!
		laptop.installApplication("eclipse");
		laptop.installApplication("chrome");

		System.out.println(totalStorageCapacity(laptop));
	}

	public static int totalStorageCapacity(Computer computer) {
		int total = 0;
		for (Storage s : computer.getStorage()) {
			total += s.getCapacity();
		}
		return total;
	}
}
