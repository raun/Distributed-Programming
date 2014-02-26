import java.io.*;

public class DaytimeClient1{
	public static void main(String args[]){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		try{
			System.out.println("Welcome to the Daytime Client\nWhat is name of server host");
			String hostName=br.readLine();
			if(hostName.length()==0){
				hostName="localhost";
			}
			System.out.println("What is port number of server");
			int port=Integer.parseInt(br.readLine());
			System.out.println("Here is time stamp from server : "+DaytimeClientHelper1.getTimestamp(hostName,port));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
