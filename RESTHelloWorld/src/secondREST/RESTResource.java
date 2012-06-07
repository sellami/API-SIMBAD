package secondREST;
 
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
 
public class RESTResource extends ServerResource{
@Get public String present() { 
	// Print the requested URI path 
return "Resource URI : " + getReference() + '\n' + "Root URI : " 
	+ getRootRef() + '\n' + "Routed part : " 
	+ getReference().getBaseRef() + '\n' + "Remaining part: " 
	+ getReference().getRemainingPart(); 
	} 
}