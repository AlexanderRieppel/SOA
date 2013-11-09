package iKnowRT;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService( endpointInterface="iKnowRT.Stuff" ) 
public class ServerIsDoingIT implements Stuff{
	Map map = new HashMap();

	@Override
	public List search(String lookUP) {
		return Searcher.search(map,lookUP);
	}

	@Override
	public boolean erstelleEintrag(String thema,
			@WebParam(name = "content") String content) {
		
		return Creator.erstelleEintrag(map,thema, content);
	}

}
