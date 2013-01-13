import java.net.Inet4Address;
import java.util.concurrent.ConcurrentLinkedQueue;

class MulticastSender {

	private GroupDataSource dataSource;
	private ConcurrentLinkedQueue<Command> buffer;
	
	public MulticastSender(){
		dataSource = new GroupDataSource();
		buffer = new ConcurrentLinkedQueue<Command>();
	}
	
	public synchronized void sendCommand(Command out,int _port){
		
	}
	
	public synchronized void addIpToMulti(Inet4Address group, Inet4Address member){
		dataSource.addIPToGroup(group, member);
	}
	
	public synchronized void registerAck(Inet4Address IP){
		
	}
	
}
