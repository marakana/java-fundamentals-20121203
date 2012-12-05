public class LaptopBag {
	String brand;
	double capacity;
	String color;
	boolean open;
	Laptop contents;

	@Override
	public String toString() {
		return "LaptopBag [brand=" + brand + ", capacity=" + capacity
				+ ", color=" + color + ", open=" + open + ", contents="
				+ contents + "]";
	}
}
