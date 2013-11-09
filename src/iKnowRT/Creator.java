package iKnowRT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import datenbasis.MapInterface;

public class Creator {

	public static boolean erstelleEintrag(String thema, String content){
MapInterface mi = null;
		
		Map map = mi.getMap();
		
		map.put(thema, content);
		//TODO XML updaten
		
		return true;
		
	}
}
