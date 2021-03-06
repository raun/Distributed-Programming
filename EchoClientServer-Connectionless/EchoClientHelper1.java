import java.net.*;
import java.io.*;

public class EchoClientHelper1{
	private MyClientDatagramSocket mysocket;
	private InetAddress serverHost;
	private int serverPort;


	EchoClientHelper1(String host, String port) throws UnknownHostException, SocketException{
		this.serverHost = InetAddress.getByName(host);
		this.serverPort = Integer.parseInt(port);
		this.mysocket = new MyClientDatagramSocket();
	}
	
	public String getEcho(String message) throws SocketException, IOException{
		mysocket.sendMessage(this.serverHost, this.serverPort, message);
		String response = mysocket.receiveMessage();
		return response;
	}
	
	public void done() throws IOException, SocketException{
		mysocket.close();
	}
}
