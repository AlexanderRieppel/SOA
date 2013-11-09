package iKnowRT;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
/**
 * SOA KwonIT Client
 * @author Thomas Traxler
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
				args[1]=url;
				add(args);
				break;
			case "ADD":
				args=prepareAddArgs(args);
				args[1]=url;
				add(args);
				break;
			default:
				synopsis();
				break;
		}
		
		

	}
	/**
	 * Fuehrt SOA Suche aus
	 */
	public static void search (String[] args){
		URL url = null;
		
		try {
			url = new URL (args[1]+"?wsdl");
		} catch (MalformedURLException e) {
			System.out.println("URL nicht correct angegeben");
			synopsis();
		}
		QName qName = new QName ("http://iKnowRT/","ServerIsDoingITService");
		Service service = Service.create(url,qName);
		Stuff stuff = service.getPort(Stuff.class);
		System.out.println(stuff.search(args[2]));
		
	}
	/**
	 * Fuehrt den Soa add aus
	 * @param args [0] unwichtig [1] URL [2] eintrags KEY [3] eintrags Inhalt
	 */
	public static void add (String[] args){
URL url = null;
		
		try {
			url = new URL (args[1]+"?wsdl");
		} catch (MalformedURLException e) {
			System.out.println("URL nicht korrect angegeben");
			synopsis();
			System.exit(0);
		}
		QName qName = new QName ("http://iKnowRT/","ServerIsDoingITService");
		Service service = Service.create(url,qName);
		Stuff stuff = service.getPort(Stuff.class);
		if(stuff.erstelleEintrag(args[2], args[3]))
			System.out.println("Erfolgreich hinzugefuegt");
		else
			System.out.println("Eintrag konnte nicht erstellt werden");
	}
	/**
	 * Gib die Synopsis aus, wird bei falschverwendung aufgerufen
	 */
	public static void synopsis(){
		//TODO put out synopsis
		System.out.println("EIn Fehler ist abgetreten");
	}
	/**
	 * Bereitet die Argumente zu ueberpruefung vor
	 * @param args
	 * @return
	 */
	public static String[] prepareArgs(String[] args){
		char[] charArray = args[0].toCharArray();
		charArray[0] = Character.toUpperCase(charArray[0]);
		args[0]=String.copyValueOf(charArray);
		return args;
	}
	/**
	 * 
	 * @param args
	 * @return
	 */
	public static String[] prepareSearchArgs(String[] args){
		if(args.length!=3){
			synopsis();
			System.exit(0);
		}
		return args;
	}
	/**
	 * 
	 * @param args
	 * @return
	 */
	public static String[] prepareAddArgs(String[] args){
		if(args.length!=4){
			synopsis();
			System.exit(0);
		}
		return args;
	}
}
