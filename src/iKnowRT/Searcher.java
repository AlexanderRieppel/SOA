package iKnowRT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import datenbasis.MapInterface;

public class Searcher {
	
	public static List search (String s){
		
		MapInterface mi = null;
		
		Map map = mi.getMap();
		
		if(!map.containsKey(s))
			return null;
		
		List l = new ArrayList();
		l.add(s);
		l.add(map.get(s));
		return l;
		
	}

}
