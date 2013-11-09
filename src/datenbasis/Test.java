package datenbasis;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String, String>();
		XMLConnector xc = new XMLConnector(hm,"D:\\data.xml");
	}
}
