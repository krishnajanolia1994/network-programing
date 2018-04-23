
package sec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            String st;
            PrintWriter pr=new PrintWriter(os);
            BufferedReader br=new 
            BufferedReader(new InputStreamReader(System.in));
            for(;;)
            {
                st=br.readLine();
                os.write(st);
                os.flush();
                if(st.equals("end"))
                    break;
            }

           
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
