public class SSD implements Disk {

	private final int readSpeed;
	private final int writeSpeed;
	private final int capacity;

	public SSD(int readSpeed, int writeSpeed, int capacity) {
		this.readSpeed = readSpeed;
		this.writeSpeed = writeSpeed;
		this.capacity = capacity;
	}

	public int getReadSpeed() {
		return readSpeed;
	}

	public int getWriteSpeed() {
		return writeSpeed;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + readSpeed;
		result = prime * result + writeSpeed;
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
		SSD other = (SSD) obj;
		if (capacity != other.capacity)
			return false;
		if (readSpeed != other.readSpeed)
			return false;
		if (writeSpeed != other.writeSpeed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SSD [readSpeed=" + readSpeed + ", writeSpeed=" + writeSpeed
				+ ", capacity=" + capacity + "]";
	}

}
