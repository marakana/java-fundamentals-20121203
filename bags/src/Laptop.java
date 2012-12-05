import java.util.Set;

public class Laptop {
	private String brand;
	private String cpuType;
	private Memory memory;
	private Disk disk;
	private Set<String> applications;
	private boolean on;
	private boolean open;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Disk getDisk() {
		return disk;
	}

	public void setDisk(Disk disk) {
		this.disk = disk;
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
