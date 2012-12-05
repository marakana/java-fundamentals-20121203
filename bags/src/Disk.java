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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + speed;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Disk other = (Disk) obj;
		if (capacity != other.capacity)
			return false;
		if (speed != other.speed)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disk [type=" + type + ", speed=" + speed + ", capacity="
				+ capacity + "]";
	}
}
