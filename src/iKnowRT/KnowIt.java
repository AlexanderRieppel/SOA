package iKnowRT;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class KnowIt {

	public static void main(String[] args) throws MalformedURLException {
		String url = "http://localhost:4434/miniwebservice";//Default
		if(args.length==0){
			synopsis();
			System.exit(0);
		}
		args = prepareArgs(args);
		switch(args[0]){
			case "G":
				args=prepareGUIArgs(args);
				gui();
				break;
			case "GUI":
				args=prepareGUIArgs(args);
				gui();
				break;
			case "S":
				args=prepareSearchArgs(args);
				search();
				break;
			case "SEARCH":
				args=prepareSearchArgs(args);
				search();
				break;
			case "A":
				args=prepareAddArgs(args);
				add();
				break;
			case "ADD":
				args=prepareAddArgs(args);
				add();
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
	public static void gui(){
		//TODO add GUI
	}
	public static void search (){
		//TODO add search
	}
	public static void add (){
		//TODO add add
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
	public static String[] prepareGUIArgs(String[] args){
		return args;
	}
	public static String[] prepareSearchArgs(String[] args){
		return args;
	}
	public static String[] prepareAddArgs(String[] args){
		return args;
	}
}
