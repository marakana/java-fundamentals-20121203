import java.util.Collection;
import java.util.Set;


public interface Computer {

	String getBrand();
	String getCpuType();
	Collection<Storage> getStorage();
	Set<String> getApplications();
	boolean isOn();
	void setOn(boolean on);

}
