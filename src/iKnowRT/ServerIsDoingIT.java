package iKnowRT;

import java.awt.List;

import javax.jws.WebParam;

public class ServerIsDoingIT implements Stuff{

	@Override
	public List search(@WebParam(name = "lookUp") String lookUP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean erstelleEintrag(@WebParam(name = "thema") String thema,
			@WebParam(name = "content") String content) {
		// TODO Auto-generated method stub
		return false;
	}

}
