package sec;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class client 
{

   
    public static void main(String[] args) 
    {
        try {
            Socket s=new Socket("localhost",9999);
            OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
            String st="krishna";
            PrintWriter pr=new PrintWriter(os);
            os.write(st);
            os.flush();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
