/**
 * 
 */
package com.ofs.sb.sec.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author USER
 *
 */
@EnableWebSecurity
public class DemoSecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("sekhar").password("{bcrypt}$2a$10$jaRDHdU6s8Oz52JndEOsPO5e7xphjpj08odk700Y7qq2hNnmROdmS").roles("ADMIN", "CUSTOMER")
		.and()
		.withUser("ravi").password("{pbkdf2}9a911df3f28db70b2936f5930a57b8721e42fd4ec8854170518584aa4454eba0dc3fef70cbda01d9").roles("EMPLOYEE")
		.and()
		.withUser("raju").password("{noop}ab12").roles("CUSTOMER");
	}
	
	//@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
