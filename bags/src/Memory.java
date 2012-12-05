public class Memory {
	private double speed;
	private int size;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Memory [speed=" + speed + ", size=" + size + "]";
	}
}
