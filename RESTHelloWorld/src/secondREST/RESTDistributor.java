package secondREST;
 
import org.restlet.Component;
import org.restlet.data.Protocol;
 
public class RESTDistributor {
 
/**
	* @param args
	* @throws Exception 
	*/
public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
// Create a new Restlet component and add a HTTP server connector to it 
Component component = new Component(); 
	component.getServers().add(Protocol.HTTP, 8182); 
 
	// Then attach it to the local host 
component.getDefaultHost().attach("/trace", RESTResource.class); 
 
	// Now, let's start the component! 
// Note that the HTTP server connector is also automatically started. 
component.start(); 
	}	
 
}