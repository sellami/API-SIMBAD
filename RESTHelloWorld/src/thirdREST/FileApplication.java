package thirdREST;
 
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
 
public class FileApplication extends Application{
public static final String ROOT_URI = "file:///C:/";
//for example: public static final String ROOT_URI = "file:///C:/";
@Override public Restlet createInboundRoot() { 
	return new Directory(getContext(), ROOT_URI); 
	} 
}