package com.project;

import com.encryption.Encryption;
import com.project.Password.hash1;
import com.project.Password.hashResponse;
import com.project.Password.validate1;
import com.project.Password.validateResponse;
import com.project.passwordGrpc.passwordImplBase;

import io.grpc.stub.StreamObserver;

public class PasswordService extends passwordImplBase{

	@Override
	public void hash(hash1 request, StreamObserver<hashResponse> responseObserver) {

		
		String userId = request.getUserId();
		String password = request.getPassword();
		 String salted;
		 String hashed;
		 
		 salted = Encryption.salt(password);
		 hashed = salted + Encryption.hash(salted);
		 
		hashResponse.Builder hashRes = hashResponse.newBuilder();
		
		hashRes.setUserId(userId).setHashedPassword(hashed).setSalt(salted);	
		
		responseObserver.onNext(hashRes.build());
		responseObserver.onCompleted();
	}

	@Override
	public void validate(validate1 request1, StreamObserver<validateResponse> responseObserver) {
		

		String password = request1.getPassword();
		String hashed = request1.getHashedPassword();
		String salt = request1.getSalt();
		
		validateResponse.Builder valRes = validateResponse.newBuilder();
		
		if(password.equals(password) && hashed.equals(hashed)) {
			valRes.setPasswordValid(true);
		}
		else {
			valRes.setPasswordValid(false);

		}
		
		responseObserver.onNext(valRes.build());
		responseObserver.onCompleted();
	}

}
