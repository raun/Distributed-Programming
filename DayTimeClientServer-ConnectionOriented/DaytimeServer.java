import java.io.*;
import java.net.*;
import java.util.*;

public class DaytimeServer{
	public static void main(String args[]){
		int port;
		if(args.length==1){
			port=Integer.parseInt(args[0]);
		}
		else{
			port=2048;
		}
		try{
			ServerSocket connectionSocket=new ServerSocket(port);
			System.out.println("Daytime Server started...");
			while(true){
				MyStreamSocket mysocket=new MyStreamSocket(connectionSocket.accept());
				System.out.println("Timestamp request received");
				Date timestamp=new Date();
				mysocket.sendMessage(timestamp.toString());
				System.out.println("Timestamp "+timestamp.toString()+" sent");
				mysocket.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
				
			
