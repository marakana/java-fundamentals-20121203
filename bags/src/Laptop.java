import java.util.Set;

public class Laptop {
	private final String brand;
	private final String cpuType;
	private final Memory memory;
	private final Disk disk;
	private Set<String> applications;
	private boolean on;
	private boolean open;

	public Laptop(String brand, String cpuType, Memory memory, Disk disk) {
		this.brand = brand;
		this.cpuType = cpuType;
		this.memory = memory;
		this.disk = disk;
	}

	public String getBrand() {
		return brand;
	}

	public String getCpuType() {
		return cpuType;
	}

	public Memory getMemory() {
		return memory;
	}

	public Disk getDisk() {
		return disk;
	}

	public Set<String> getApplications() {
		return applications;
	}

	public void setApplications(Set<String> applications) {
		this.applications = applications;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cpuType=" + cpuType + ", memory="
				+ memory + ", disk=" + disk + ", applications=" + applications
				+ ", on=" + on + ", open=" + open + "]";
	}
}
