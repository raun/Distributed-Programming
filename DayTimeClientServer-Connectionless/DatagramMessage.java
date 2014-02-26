import java.net.*;

public class DatagramMessage{
	private String message;
	private InetAddress host;
	private int port;
	public void putVal(String message,InetAddress host,int port){
		this.message=message;
		this.host=host;
		this.port=port;
	}
	public InetAddress getAddress(){
		return host;
	}
	public int getPort(){
		return port;
	}
	public String getMessage(){
		return message;
	}
}
