import java.io.*;
import java.net.*;

public class MyServerDatagramSocket extends DatagramSocket{
	
	final int MAX_LEN = 20;
	MyServerDatagramSocket(int port) throws SocketException{
		super(port);
	}
	
	MyServerDatagramSocket() throws SocketException{
		super();
	}
	
	public void sendMessage(InetAddress receiverHost, int receiverPort, String message) throws IOException{
		byte[] sendBuffer = message.getBytes();
		DatagramPacket packet = new DatagramPacket(sendBuffer, sendBuffer.length, receiverHost, receiverPort);
		this.send(packet);
	}
	
	public String receiveMessage() throws IOException{
		byte[] receiveBuffer = new byte[MAX_LEN];
		DatagramPacket packet = new DatagramPacket(receiveBuffer, MAX_LEN);
		this.receive(packet);
		String message = new String(receiveBuffer);
		return message;
	}
	
	public DatagramMessage receiveMessageAndSender() throws IOException{
		byte[] receiveBuffer = new byte[MAX_LEN];
		DatagramPacket packet = new DatagramPacket(receiveBuffer, MAX_LEN);
		this.receive(packet);
		DatagramMessage returnVal = new DatagramMessage();
		returnVal.putVal(new String(receiveBuffer), packet.getAddress(), packet.getPort());
		return returnVal;
	}
}
		
	
	
