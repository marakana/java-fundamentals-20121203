public class Memory {
	private final double speed;
	private final int size;

	public Memory(double speed, int size) {
		this.speed = speed;
		this.size = size;
	}

	public double getSpeed() {
		return speed;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Memory [speed=" + speed + ", size=" + size + "]";
	}
}
