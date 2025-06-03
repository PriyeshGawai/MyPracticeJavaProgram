package streamApi;

import java.beans.Encoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Base64EncodeDecode {

	public static void main(String[] args) throws Exception {
		
		String pwd= "abcd$123";
		
		MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
		
		byte[] digest=messageDigest.digest(pwd.getBytes());
		
		System.out.println("Encripted pass:: "+ new String(digest));
		
		java.util.Base64.Encoder encoder=Base64.getEncoder();
		
		byte[] encode=encoder.encode(digest);
		
		System.out.println("Encrypted + Encode : "+ new String(encode));
		
		/*
		//Encoding +Decoding
		
		java.util.Base64.Encoder encoder=Base64.getEncoder();
		
		//converting String to byte[] and passing as input for encode() method
		byte[] encode=encoder.encode(pwd.getBytes());
		
		//converting byte[] to string
		String encodePwd=new String(encode);
		
		System.out.println("EncodePassword::"+encodePwd);
		
		Decoder decoder=Base64.getDecoder();
		
		byte[] decode=decoder.decode(encodePwd);
		
		String pass=new String(decode);
		
		System.out.println(pass);
		*/
	}

}
