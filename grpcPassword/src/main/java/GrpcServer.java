import java.io.IOException;

import com.encryption.Encryption;
import com.project.Password.hash1;
import com.project.Password.hashResponse;
import com.project.Password.validate1;
import com.project.Password.validateResponse;
import com.project.PasswordService;
import com.project.passwordGrpc.passwordImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class GrpcServer extends passwordImplBase{

	 public static void main(String args[]) throws IOException, InterruptedException {
		 
		 
		 //// encryption method hash
		 String password = "123456";
		 String salted;
		 String hashed;
		 
		 salted = Encryption.salt(password);
		 hashed = salted + Encryption.hash(salted);
		 
		 //////////////////
		 /// server starting //
		 System.out.println("=============================================\n\nstarting GRPC Server");
		 Server server = ServerBuilder.forPort(9090).addService(

				 new PasswordService()).build();
		 
		 server.start();
		 System.out.println("server started at "+ server.getPort());
	        server.awaitTermination();
	 }	 
}