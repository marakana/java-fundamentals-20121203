public class Disk {
	private final String type;
	private final int speed;
	private final int capacity;

	public Disk(String type, int speed, int capacity) {
		this.type = type;
		this.speed = speed;
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public int getSpeed() {
		return speed;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "Disk [type=" + type + ", speed=" + speed + ", capacity="
				+ capacity + "]";
	}
}
