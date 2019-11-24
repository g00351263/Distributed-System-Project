package ie.gmit.ds;

import java.net.URI;

import java.util.Collection;
import java.util.HashMap;


import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;

import com.project.Password.hash1;
import com.project.Password.hashResponse;
import com.project.Password.validate1;
import com.project.Password.validateResponse;
import com.project.passwordGrpc;
import com.project.passwordGrpc.passwordBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;



@Path("/users")
@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
public class UserApiResource {
	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
	// collection frame work to store all users data//
	private HashMap<Integer, UserHashed> usersMap = new HashMap<>();
	
	UserHashed newuser;
	
	UserHashed testUser = new UserHashed(0, "The GZA", "HipHop", "aadfadfadfad","","");
	UserHashed testUser1 = new UserHashed(1, "The Raja", "HipHop", "b","","");

	// constructor with same hard coded users//
	public UserApiResource() {
		usersMap.put(testUser.getUserId(), testUser);
		usersMap.put(testUser1.getUserId(), testUser1);

	}

	// Getting all users as collection//
	@GET
	public Collection<UserHashed> getUsers() {

		return usersMap.values();
	}

	// Getting individual user by id//
	@GET
	@Path("/{userId}")
	public Response getUserById(@PathParam("userId") int id) throws Exception {
		
		int id1 = usersMap.get(id).getUserId();
		
		if (id < 0 || id != id1) {
			throw new Exception();
		} else {
			return Response.status(Status.OK).entity(usersMap.get(id)).build();
					
		}	
		

		
//////////////////////////////
		
		

	}

	// creating new user and returning the collections with new user//
	@POST
	public Response newUser(UserHashed user) throws Exception {
				
		int id = usersMap.size()+1;
		
		user.setUserId(id);
		
		String uu = String.valueOf(user.getUserId());

		
 // generate from proto file stubs for client //
		passwordBlockingStub userStub = passwordGrpc.newBlockingStub(channel);
			
		hash1 loginRequest = hash1.newBuilder().setUserId(Integer.toString(id)).setPassword(user.getPassword()).build();
			
		hashResponse response = userStub.hash(loginRequest);
		
		System.out.println("\n\n=========Server Response===============");
	
		String hash = response.getHashedPassword();
		String salt = response.getSalt();
		
		user.setHashed(hash);
		user.setSalted(salt);
		
		usersMap.put(id, user);
	
		return Response.created(new URI("/users/" + uu)).entity(usersMap.get(user.getUserId())).status(Status.CREATED).build();

	}

	// deleting the user by given id//
	@DELETE
	@Path("{userId}")
	public Response deleteUser(@PathParam("userId") int id) throws Exception {

		if(id == usersMap.get(id).getUserId()) {
			usersMap.remove(id);
			return Response.ok(usersMap.values()).build();
		} else {
		
			return Response.status(Status.OK).entity(usersMap.get(id)).build();

		}
	}

	// Getting individual user by id and updating it//
	@PUT
	@Path("/{userId}")
	public Response updateUser(@PathParam("userId")int id, UserHashed user) throws Exception {
		
		newuser = user;
		
		newuser.setUserId(id);
		
		usersMap.replace(id, user);
			
		return Response.status(Status.OK).entity(usersMap.get(id)).build();
	}
	
	// Getting individual user by id and updating it//

}
