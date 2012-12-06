import java.util.Collection;
import java.util.Set;

public class Laptop implements Computer {
	private final String brand;
	private final String cpuType;
	private final Collection<Storage> storage;
	private Set<String> applications;
	private boolean on;
	private boolean open;

	public Laptop(String brand, String cpuType, Collection<Storage> storage) {
		this.brand = brand;
		this.cpuType = cpuType;
		this.storage = storage;
	}

	public String getBrand() {
		return brand;
	}

	public String getCpuType() {
		return cpuType;
	}

	public Collection<Storage> getStorage() {
		return storage;
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
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
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
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cpuType=" + cpuType + ", storage="
				+ storage + ", applications=" + applications + ", on=" + on
				+ ", open=" + open + "]";
	}

}
