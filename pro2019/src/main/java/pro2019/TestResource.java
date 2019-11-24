package pro2019;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

	@GET
	public String name(@PathParam("name") String name) {
		return "hellow internet " + name;
	}
}
