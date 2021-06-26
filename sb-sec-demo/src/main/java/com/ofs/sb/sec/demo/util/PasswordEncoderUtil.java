/**
 * 
 */
package com.ofs.sb.sec.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * @author dorak
 *
 */
public class PasswordEncoderUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String password = "abcd";
		String encodedPwd =  NoOpPasswordEncoder.getInstance().encode(password);
		System.out.println(encodedPwd);

		encodedPwd = new BCryptPasswordEncoder().encode(password);
		System.out.println(encodedPwd);
		
		encodedPwd = new Pbkdf2PasswordEncoder().encode("1234");
		System.out.println(encodedPwd);
		
		encodedPwd = new StandardPasswordEncoder().encode("hyd");
		System.out.println(encodedPwd);
		
	}

}
