public class LaptopBag {
	private final String brand;
	private final double capacity;
	private final Color color;
	private boolean open;
	private Laptop contents;

	public LaptopBag(String brand, double capacity, Color color) {
		this.brand = brand;
		this.capacity = capacity;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public Color getColor() {
		return color;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public void setContents(Laptop contents) {
		if (contents.isOn() || contents.isOpen()) {
			throw new LaptopOverheatingException();
		}
		this.contents = contents;
	}

	public Laptop getContents() {
		return contents;
	}

	@Override
	public String toString() {
		return "LaptopBag [brand=" + getBrand() + ", capacity=" + capacity
				+ ", color=" + color + ", open=" + open + ", contents="
				+ contents + "]";
	}

}
