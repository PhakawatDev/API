package my.example.ws;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;
import my.example.notifies.req.Request;
import my.example.notifies.res.ResponseH;
import my.example.notifies.res.ResponseHeader;

@Slf4j
@Path("/notifies")
public class NotifyResource {
 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNotify(Request requestHeader) throws  URISyntaxException {
    	log.debug("addNotify entering");
    	
    	ResponseHeader res = new ResponseHeader();
    	
    	if (requestHeader.getRequestHeader().getOptions().equals("") || requestHeader.getRequestHeader().getOptions().equals("TEST")) {
    		res.setResponseCode("OK");
        	res.setResponseMessage("SUCCESS"); 
    	}else {
    		res.setResponseCode("ERROR");
        	res.setResponseMessage("OPTION INVALID"); 
    	}
    	
    	res.setSourceSystem(requestHeader.getRequestHeader().getDestinationSystem());
    	res.setDestinationSystem(requestHeader.getRequestHeader().getSourceSystem());
    	
    	ResponseH resH = new ResponseH();
    	resH.setResponseHeader(res);
    	
		return Response.status(Response.Status.OK)
				.entity(resH)
				.build();
    }
    
}