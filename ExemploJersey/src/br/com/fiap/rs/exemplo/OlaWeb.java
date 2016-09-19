package br.com.fiap.rs.exemplo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path(value="exemplows")
public class OlaWeb {

	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String Ola(){
		return "Ola, amiguinho";
	}*/
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response Ola(){
		return Response.status(Response.Status.OK).entity("Deu certo").build();
	}
}
