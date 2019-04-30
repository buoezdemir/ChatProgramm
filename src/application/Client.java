import java.io.*;
import java.net.*;
import java.util.Scanner;
 
public class Client {
 
   public static void main(String argv[])
      {
	   try{
		    Socket socketClient= new Socket("localhost",5555);
		    System.out.println("Clientwurde gestartet");
//Reader & Writer
		    BufferedReader reader = 
		    new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
		    BufferedWriter writer= 
	        new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
		    
		    String serverMsg;
            writer.flush();
			while((serverMsg = reader.readLine()) != null){
				System.out.println("Client: " + serverMsg);
			}
			reader.close();
			writer.close();
 
	   }catch(Exception e){e.printStackTrace();}
      }
}
