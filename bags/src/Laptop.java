import java.util.Collection;

public class Laptop extends Computer {
	private boolean open;

	public Laptop(String brand, String cpuType, Collection<Storage> storage) {
		super(brand, cpuType, storage);
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

}
