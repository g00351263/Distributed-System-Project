package com.encryption;
import java.math.BigInteger;
import java.security.*;

public class Encryption {
	
	// converting to hash or MD5 //
	public static String hash(String str) {
		try {
			
			MessageDigest md = MessageDigest.getInstance("MD5"); // MD5 or hashing using message digest
			byte[] messageDigest = md.digest(str.getBytes()); // converting hash to bytes for transportation//
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16); // converting number to string //
			
			while(hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			
			return hashtext;
			
		}catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	// converting to SHA1 or salted //
	public static String salt(String str)  {
		try {
			MessageDigest mDigest = MessageDigest.getInstance("SHA1");
			byte[] result = mDigest.digest(str.getBytes());
			StringBuffer sb = new StringBuffer();
			
			for(int i = 0; i < result.length; i++) {
				sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
			}
			
			return sb.toString();
		}catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

}
