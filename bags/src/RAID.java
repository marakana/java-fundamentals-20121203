import java.util.List;

public class RAID implements Disk {

	private final List<Disk> disks;

	public RAID(List<Disk> disks) {
		this.disks = disks;
	}

	public List<Disk> getDisks() {
		return disks;
	}

	@Override
	public int getCapacity() {
		int total = 0;
		for (Disk disk : disks) {
			total += disk.getCapacity();
		}
		return total;
	}

	@Override
	public int getReadSpeed() {
		int min = Integer.MAX_VALUE;
		for (Disk disk : disks) {
			min = Math.min(min, disk.getReadSpeed());
		}
		return min;
	}

	@Override
	public int getWriteSpeed() {
		int min = Integer.MAX_VALUE;
		for (Disk disk : disks) {
			min = Math.min(min, disk.getWriteSpeed());
		}
		return min;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disks == null) ? 0 : disks.hashCode());
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
		RAID other = (RAID) obj;
		if (disks == null) {
			if (other.disks != null)
				return false;
		} else if (!disks.equals(other.disks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RAID [disks=" + disks + "]";
	}

}
