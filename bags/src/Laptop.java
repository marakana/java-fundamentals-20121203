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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cpuType == null) ? 0 : cpuType.hashCode());
		result = prime * result + ((disk == null) ? 0 : disk.hashCode());
		result = prime * result + ((memory == null) ? 0 : memory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cpuType == null) {
			if (other.cpuType != null)
				return false;
		} else if (!cpuType.equals(other.cpuType))
			return false;
		if (disk == null) {
			if (other.disk != null)
				return false;
		} else if (!disk.equals(other.disk))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cpuType=" + cpuType + ", memory="
				+ memory + ", disk=" + disk + ", applications=" + applications
				+ ", on=" + on + ", open=" + open + "]";
	}
}
