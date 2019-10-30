package com.grpcClient;

import com.project.passwordGrpc;
import com.project.Password.hash1;
import com.project.Password.hashResponse;
import com.project.Password.validate1;
import com.project.Password.validateResponse;
import com.project.passwordGrpc.passwordBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class grpcClient {

	public static void main(String[] args) {
		String user = "12345";
		String pass = "12345";
		
		System.out.println("User id sent = " + user +"\nUser Password sent = " + pass);
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
	
	 // generate from proto file stubs for client //
		passwordBlockingStub userStub = passwordGrpc.newBlockingStub(channel);
		
		hash1 loginRequest = hash1.newBuilder().setUserId(user).setPassword(pass).build();
		
		hashResponse response = userStub.hash(loginRequest);

		System.out.println("\n\n=========Server Response===============");
		System.out.println(response.toString());
	
		validate1 val = validate1.newBuilder().setPassword(pass).setHashedPassword(response.getHashedPassword()).build();
	
		validateResponse valRes = userStub.validate(val);
		
		System.out.println(valRes.toString());
	
	}

}
