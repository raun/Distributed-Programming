import java.io.*;

public class DaytimeClient{
	public static void main(String args[]){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter address of server");
			String server=br.readLine();
			if(server.length()==0)
				server="localhost";
			System.out.println("Enter port of server");
			String ports=br.readLine();
			if(ports.length()==0)
				ports="2048";
			int port=Integer.parseInt(ports);
			System.out.println("Time stamp from server is "+DaytimeClientHelper.getTimestamp(server,port));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
			
