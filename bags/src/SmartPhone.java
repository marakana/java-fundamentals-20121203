import java.util.Collection;


public class SmartPhone extends Computer {

	private int ringerVolume = 0;

	public SmartPhone(String brand, String cpuType, Collection<Storage> storage) {
		super(brand, cpuType, storage);
	}

	public void increaseRingerVolume() {
		ringerVolume++;
	}

	public void decreaseRingerVolume() {
		ringerVolume--;
	}

}
