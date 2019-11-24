package ie.gmit.ds;
import com.project.passwordGrpc;
import com.project.Password.hash1;
import com.project.Password.hashResponse;
import com.project.Password.validate1;
import com.project.Password.validateResponse;
import com.project.passwordGrpc.passwordBlockingStub;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
public class UserApiApplication extends Application<UserApiConfig>{
   
	public static void main(String[] args) throws Exception {
        new UserApiApplication().run(args);
 
    }

	@Override
	public void run(UserApiConfig configuration, Environment environment) throws Exception {
	
		final ExampleHealthCheck healthCheck = new ExampleHealthCheck();
		final UserApiResource resource = new UserApiResource();
		environment.healthChecks().register("example", healthCheck);
	    environment.jersey().register(resource);
	}

 
}
