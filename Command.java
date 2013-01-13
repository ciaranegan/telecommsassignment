import java.net.Inet4Address;

public class Command {

	private MultiCastGroup multicast;
	private String command;
	
	public Command(String _command, MultiCastGroup _multicast){
		
		multicast = _multicast;
		command = _command;
		
	}
	
	public Inet4Address[] getMembers(){
		return null;
	}
	
	public String getCommand(){
		return command;
	}
	
	
	
}
