import java.util.Set;

public class Laptop {
	String brand;
	String cpuType;
	Memory memory;
	Disk disk;
	Set<String> applications;
	boolean on;
	boolean open;

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cpuType=" + cpuType + ", memory="
				+ memory + ", disk=" + disk + ", applications=" + applications
				+ ", on=" + on + ", open=" + open + "]";
	}
}
