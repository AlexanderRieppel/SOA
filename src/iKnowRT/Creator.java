package iKnowRT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import datenbasis.MapInterface;

public class Creator {

	public static boolean erstelleEintrag(Map map,String thema, String content){
MapInterface mi = null;
		
		
		System.out.println(thema+content);
		map.put(thema, content);
		//TODO XML updaten
		
		return true;
		
	}
}
