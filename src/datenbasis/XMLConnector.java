package datenbasis;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class XMLConnector extends Entry{
	private File xmlFile;

	public XMLConnector(String path){
		xmlFile = new File(path);
		if(xmlFile.exists()==false){
			try {
				xmlFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void build() {
		SAXBuilder builder = new SAXBuilder();
		try {
			XMLOutputter xo = new XMLOutputter();
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List list = rootNode.getChildren("Hallo");

			for (int i = 0; i < list.size(); i++) {
				Element node = (Element) list.get(i);
			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}
	//Read Methoden
	public String readEntry(int id){
		return null;
	}
	public String[] readAll(){
		return null;
	}
	
	public String readContent(String key){
		return null;
	}
	public String readKey(String content){
		return null;
	}
	public String readId(String key){
		return null;
	}
	
	
	//Methoden für Key
	public String getKey(int id){
		return null;
	}
	public void setKey(int id){
		
	}
	//Methoden für Content
	public void getContent(int id){
		
	}
	public void getContent(String key){
		
	}
	public String setContent(int id){
		return null;
	}
	public String setContent(String key){
		return null;
	}
	
	public void write(String key, String content){
		
	}
	

	public String toString(){
		String s="";
		s+=
		return s;
	}
}
