package datenbasis;

import java.util.*;
import javax.swing.JOptionPane;

public class HashMapTest {
	public static void main(String[] args){
		HashMap m =  new HashMap<String,String>();
		m.put("Hallo", "AAAA");
		m.put("AAAA", "Hallo");
		m.put("Hallo", "BBBB");
		String hi = JOptionPane.showInputDialog("Suche nach Eintrag");
		if(m.containsKey(hi)){
			System.out.println("Thema:\n"+hi+"\n\n"+"Inhalt:\n"+m.get(hi));
		}else{
			System.out.println("Der gesuchte Eintrag existiert nicht!");
		}
	}
}
