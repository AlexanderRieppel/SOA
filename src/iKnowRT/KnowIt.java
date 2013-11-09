package iKnowRT;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
/**
 * CLIENT
 * @author THomas Traxler
 *
 */
public class KnowIt {

	public static void main(String[] args) throws MalformedURLException {
		String url = "http://localhost:4434/miniwebservice";//Default
		if(args.length==0){
			synopsis();
			System.exit(0);
		}
		args = prepareArgs(args);
		switch(args[0]){
			case "S":
				args=prepareSearchArgs(args);
				search(args);
				break;
			case "SEARCH":
				args=prepareSearchArgs(args);
				search(args);
				break;
			case "A":
				args=prepareAddArgs(args);
				add(args);
				break;
			case "ADD":
				args=prepareAddArgs(args);
				add(args);
				break;
			default:
				synopsis();
				break;
		}
//		//url = ( args.length > 0 ) ? args[0] : "http://localhost:4434/miniwebservice"; 
//	      Service service = Service.create(
//	            new URL( url + "?wsdl" ),
//	            new QName( "http://miniwebservice/", "HalloWeltImplService" ) );//Nich richtig jetzt 
//		Stuff stuff = service.getPort( Stuff.class);
//		if(true){//search
//			System.out.println(stuff.search("args"));
//		}else{//create
//			boolean bool = stuff.erstelleEintrag("Thema","Content");
//			if(bool);
//				//Do something with it
//			
//		}
		
		

	}
	public static void search (String[] args){
		URL url = null;
		
		try {
			url = new URL (args[1]+"?wsdl");
		} catch (MalformedURLException e) {
			System.out.println("URL nciht correct angegeben");
			synopsis();
		}
		QName qName = new QName ("http://iKnowRT/","SearcherService");
		Service service = Service.create(url,qName);
		Stuff stuff = service.getPort(Stuff.class);
		System.out.println(stuff.search(args[2]));
		
	}
	public static void add (String[] args){
URL url = null;
		
		try {
			url = new URL (args[1]+"?wsdl");
		} catch (MalformedURLException e) {
			System.out.println("URL nicht korrect angegeben");
			synopsis();
		}
		QName qName = new QName ("http://iKnowRT/","SearcherService");
		Service service = Service.create(url,qName);
		Stuff stuff = service.getPort(Stuff.class);
		if(stuff.erstelleEintrag(args[2], args[3]))
			System.out.println("Erfolgreich hinzugefuegt");
		else
			System.out.println("Eintrag konnte nicht erstellt werden");
	}
	public static void synopsis(){
		//TODO put out synopsis
	}
	public static String[] prepareArgs(String[] args){
		char[] charArray = args[0].toCharArray();
		charArray[0] = Character.toUpperCase(charArray[0]);
		args[0]=String.copyValueOf(charArray);
		return args;
	}
	public static String[] prepareSearchArgs(String[] args){
		if(args.length!=3){
			synopsis();
			System.exit(0);
		}
		return args;
	}
	public static String[] prepareAddArgs(String[] args){
		if(args.length!=4){
			synopsis();
			System.exit(0);
		}
		return args;
	}
}
