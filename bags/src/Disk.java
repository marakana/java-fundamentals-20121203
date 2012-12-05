public class Disk {
	private String type;
	private int speed;
	private int capacity;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Disk [type=" + type + ", speed=" + speed + ", capacity="
				+ capacity + "]";
	}
}
