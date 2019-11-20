package ie.gmit.ds;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserApiResource {

	// collection frame work to store all users data//
	private HashMap<Integer, User> usersMap = new HashMap<>();

	// constructor with same hard coded users//
	public UserApiResource() {
		User testUser = new User(1, "The GZA", "HipHop", 2);
		User testUser1 = new User(2, "The Raja", "HipHop", 1);
		usersMap.put(testUser.getUserId(), testUser);
		usersMap.put(testUser1.getUserId(), testUser1);
	}

	// Getting all users as collection//
	@GET
	public Collection<User> getUsers() {

		return usersMap.values();
	}

	// Getting individual user by id//
	@GET
	@Path("/{userId}")
	public User getUserById(@PathParam("userId") int id) throws Exception {
		
		int id1 = usersMap.get(id).getUserId();
		
		if (id < 0 || id != id1) {
			throw new Exception();
		} else {
			return usersMap.get(id);
		}
	}

	// creating new user and returning the collections with new user//
	@POST
	public Response newUser(User user) throws Exception {
		String uu = String.valueOf(user.getUserId());

		usersMap.put(user.getUserId(), user);

		return Response.created(new URI("/users/" + uu)).entity(usersMap.get(user.getUserId())).build();

	}

	// deleting the user by given id//
	@DELETE
	@Path("{userId}")
	public Collection<User> deleteUser(@PathParam("userId") int id) throws Exception {

		int id1 = usersMap.get(id).getUserId();

		if (id < 0 || id != id1) {
			throw new Exception();
		} else {

			usersMap.remove(id);
			return usersMap.values();
		}
	}

	// Getting individual user by id//
	@PUT
	@Path("{userId}")
	public User getUserById(@PathParam("userId") int id, User use) throws Exception {
		if (use.getUserId() < 0) {
			throw new Exception();
		}
		usersMap.put(use.getUserId(), use);
		return usersMap.get(id);
	}
}
