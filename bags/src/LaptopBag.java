public class LaptopBag {
	private String brand;
	private double capacity;
	private String color;
	private boolean open;
	private Laptop contents;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
