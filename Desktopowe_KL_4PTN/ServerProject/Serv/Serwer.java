import java.io.*;
import java.net.*;

public class Serwer {
    public static void main(String[] args) {
        int port = 9876;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket socket = serverSocket.accept();

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                String line;
//                String name="";
//                int x=0;
//                int y=0;
                while ((line = in.readLine()) != null) {
                    out.println(line);
//                    name = line.substring(0,line.indexOf(","));
//                    x = Integer.parseInt(line.substring(line.indexOf(",")+1, line.indexOf(":")));
//                    y = Integer.parseInt(line.substring(line.indexOf(":")+1, line.length()));
                    
                    System.out.println("Odebrano od klienta: " + line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}