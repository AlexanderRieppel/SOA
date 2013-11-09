package iKnowRT;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import datenbasis.MapInterface;

public class Searcher {
	
	public static List search (Map map,String s){
		
		MapInterface mi = null;
		
		
		if(!map.containsKey(s))
			return null;
		
		List l = new ArrayList();
		l.add(s);
		l.add(map.get(s));
		return l;
		
	}

}
