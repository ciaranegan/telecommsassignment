import java.net.Inet4Address;
import java.util.TreeMap;


public class GroupDataSource {
	
	private TreeMap<Inet4Address, MultiCastGroup> multiLookup;
	
	public GroupDataSource(){
		multiLookup = new TreeMap<Inet4Address, MultiCastGroup>();
	}
	
	public void addIPToGroup(Inet4Address group, Inet4Address member){
		
	}
}
