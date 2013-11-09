package datenbasis;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

public class XMLConnector {
	private File xmlFile;
	private Document xml;
	private HashMap<String,String> hm;

	public XMLConnector(HashMap<String, String> hm, String path) {
		this.hm=hm;
		xmlFile = new File(path);
		Element e = new Element("hi");
		if (xmlFile.exists() == false) {
			try {
				xmlFile.createNewFile();
			} catch (IOException io) {
				io.printStackTrace();
			}
		}
		try {
			xml.setRootElement(e);
			xml = new SAXBuilder().build(path);
			System.out.println(xml.getRootElement());
		} catch (JDOMException | IOException asd) {
			asd.printStackTrace();
		}
	}

//	public void build() {;
//		try {
//			Element rootNode = document.getRootElement();
//			List list = rootNode.getChildren("Hallo");
//
//			for (int i = 0; i < list.size(); i++) {
//				Element node = (Element) list.get(i);
//			}
//
//		} catch (IOException io) {
//			System.out.println(io.getMessage());
//		} catch (JDOMException jdomex) {
//			System.out.println(jdomex.getMessage());
//		}
//	}

	// Read Methoden
	public String read(String key) {
		return this.toString();
	}

	public void write() {

	}
	public void clear(){
		
	}

	public void delete(String key) {

	}

	public void add(String key,String content) {

	}
	public String toString(){
		String s="";
		return s;
	}
}
