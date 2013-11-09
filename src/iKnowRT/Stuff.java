package iKnowRT;

import java.util.List;

import javax.jws.*;

@WebService
public interface Stuff
{
   public List search( @WebParam( name = "lookUp" ) String lookUP );
   public boolean erstelleEintrag( @WebParam( name = "thema" ) String thema, @WebParam( name = "content" ) String content);
  
}