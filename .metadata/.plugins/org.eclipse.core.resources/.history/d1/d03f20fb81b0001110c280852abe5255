package thirdREST;
 
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
 
	// add a Restlet client that run FILE protocol to the component
component.getClients().add(Protocol.FILE);
 
// Attach the application to the component and start it 
component.getDefaultHost().attach("/doc/",new FileApplication()); 
	component.start(); 
	}	
 
}