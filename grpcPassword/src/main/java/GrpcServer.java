import java.io.IOException;

import com.encryption.Encryption;
import com.project.PasswordService;

import io.grpc.Server;
import io.grpc.ServerBuilder;


public class GrpcServer {

	 public static void main(String args[]) throws IOException, InterruptedException {
		 
		 
		 //// encryption method hash
		 String password = "123456";
		 String salted;
		 String hashed;
		 
		 salted = Encryption.salt(password);
		 hashed = salted + Encryption.hash(salted);
		 
		 System.out.println("=============================================");
		 System.out.println("Password check " + password);
		 System.out.println("MD5 " + Encryption.hash(password));
		//////////////////
		 
		 //// encryption method Salt //
		 System.out.println("SALT " + Encryption.salt(password));
		 
		 //// encryption salted password then hased ///
		 System.out.println("Salted Then Hashed Password " + hashed);
		
		 //////////////////
		 /// server starting //
		 System.out.println("=============================================\n\nstarting GRPC Server");
		 Server server = ServerBuilder.forPort(9090).addService(

				 new PasswordService()).build();
		 
		 server.start();
		 System.out.println("server started at "+ server.getPort());
	        server.awaitTermination();
	 }
	 
	 ///// server finished code //
	 
	 
}