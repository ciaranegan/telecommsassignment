import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;


class BroadcastSender {
	
	private ArrayList<Inet4Address> ackList;
	private ConcurrentLinkedQueue<byte[]> buffer;
	
	public BroadcastSender(){
		ackList = new ArrayList<Inet4Address>();
	}
	
	public synchronized void sendBroadcast(byte[] frame,int _port){
		
	}
	
	public synchronized void addToAckList(Inet4Address _sender){
		
	}
	
	public synchronized void registerAck(Inet4Address _sender){
		
	}
	

}
