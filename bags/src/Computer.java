import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Computer {
	private final String brand;
	private final String cpuType;
	private final Collection<Storage> storage;
	private final Set<String> applications = new HashSet<String>();
	private boolean on;

	public Computer(String brand, String cpuType, Collection<Storage> storage) {
		this.brand = brand;
		this.cpuType = cpuType;
		this.storage = new ArrayList<Storage>(storage);
	}

	public String getBrand() {
		return brand;
	}

	public String getCpuType() {
		return cpuType;
	}

	public Collection<Storage> getStorage() {
		return Collections.unmodifiableCollection(storage);
	}

	public void installApplication(String application) {
		applications.add(application);
	}

	public void uninstallApplication(String application) {
		applications.remove(application);
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
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
		Computer other = (Computer) obj;
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
		return "Computer [brand=" + brand + ", cpuType=" + cpuType
				+ ", storage=" + storage + ", applications=" + applications
				+ ", on=" + on + "]";
	}

}
