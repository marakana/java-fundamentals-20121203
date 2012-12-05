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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		long temp;
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Memory other = (Memory) obj;
		if (size != other.size)
			return false;
		if (Double.doubleToLongBits(speed) != Double
				.doubleToLongBits(other.speed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Memory [speed=" + speed + ", size=" + size + "]";
	}
}
