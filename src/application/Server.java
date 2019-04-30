import java.io.*;
import java.net.*;
 
class Server
{
   public static void run throws Exception
      {
 
   		 System.out.println(" Server wurde gestartet  " );
         ServerSocket mysocket = new ServerSocket(5555);
 
         while(true)
         {
            Socket connectionSocket = mysocket.accept();
 
            BufferedReader reader =
            		new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            BufferedWriter writer= 
            		new BufferedWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
 
            writer.write("*** Willkommen zum Chat  ***\r\n");
            writer.flush();
            String nachricht;
            while ((nachricht = reader.readLine()) != null) {
				writer.write(nachricht + "\n");
				writer.flush();
				System.out.println("Empfangen vom Client : " + nachricht);+

			}
            connectionSocket.close();
         }
      }
}
