package iKnowRT;

import javax.xml.ws.Endpoint;

public class StartServer
{
   public static void main( final String[] args )
   {
      String url = ( args.length > 0 ) ? args[0] : "http://localhost:4434/miniwebservice";
      Endpoint.publish( url, new ServerIsDoingIT());
   }
}