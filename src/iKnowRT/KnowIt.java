package iKnowRT;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class KnowIt {

	public static void main(String[] args) throws MalformedURLException {
		String url = "http://localhost:4434/miniwebservice";
		//url = ( args.length > 0 ) ? args[0] : "http://localhost:4434/miniwebservice"; TODO ahndle URL/Args
		//TODO Synopsis
	      Service service = Service.create(
	            new URL( url + "?wsdl" ),
	            new QName( "http://miniwebservice/", "HalloWeltImplService" ) );//Nich richtig jetzt TODO
		Stuff stuff = service.getPort( Stuff.class);
		if(true){//search
			System.out.println(stuff.search("args"));
		}else{//create
			boolean bool = stuff.erstelleEintrag("Thema","Content");
			if(bool);
				//Do something with it
			
		}
		

	}

}
