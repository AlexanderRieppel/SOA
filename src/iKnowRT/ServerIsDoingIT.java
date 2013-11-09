package iKnowRT;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService( endpointInterface="iKnowRT.Stuff" ) 
public class ServerIsDoingIT implements Stuff{

	@Override
	public List search(String lookUP) {
		return Searcher.search(lookUP);
	}

	@Override
	public boolean erstelleEintrag(String thema,
			@WebParam(name = "content") String content) {
		// TODO Auto-generated method stub
		return false;
	}

}
