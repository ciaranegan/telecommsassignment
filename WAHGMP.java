
public class WAHGMP {

	private static final int requestPort = 50000;
	private static final int communicationPort = 50001;
	private static WAHGMP singleton;
	private MulticastSender multicastSender;
	private BroadcastSender broadcastSender;
	
	public static WAHGMP sharedInstance(){
		if(singleton==null){
			singleton = new WAHGMP();
		}
		return singleton;
	}
	
	private WAHGMP(){
		multicastSender = new MulticastSender();
		broadcastSender = new BroadcastSender();
	}
	
	public void joinGroup(MultiCastGroup group){
		byte[] request = WAHGMPFrameGen.getJoinRequest(group);
		broadcastSender.sendBroadcast(request,requestPort);
	}
	
	public void leaveGroup(MultiCastGroup group){
		byte[] request = WAHGMPFrameGen.getLeaveRequest(group);
		broadcastSender.sendBroadcast(request,requestPort);
	}
	
	public MultiCastGroup[] getGroups(){
		return null;
	}
	
	public void sendToGroup(Command cmd){
		multicastSender.sendCommand(cmd,communicationPort);
	}

}
