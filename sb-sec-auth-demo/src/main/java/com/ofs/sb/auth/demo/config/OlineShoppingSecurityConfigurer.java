/**
 * 
 */
package com.ofs.sb.auth.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author USER
 *
 */
@EnableWebSecurity
public class OlineShoppingSecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("ravi").password("1234").roles("ADMIN")
		.and().withUser("mahesh").password("1234").roles("ADMIN", "SELLER")
		.and().withUser("raju").password("abcd").roles("CUSTOMER")
		.and().withUser("ramu").password("ab34").roles("SELLER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		//.antMatchers("/admin/home").hasRole("ADMIN")
		//.antMatchers("/admin/createuser").hasRole("ADMIN")
		.antMatchers("/admin/**").hasRole("ADMIN")
		//.antMatchers("/customer/home").hasRole("CUSTOMER")
		//.antMatchers("/customer/placeorder").hasRole("CUSTOMER")
		//.antMatchers("/customer/**").hasRole("CUSTOMER")
		.antMatchers("/customer/**").hasAnyRole("CUSTOMER", "ADMIN")
		
		//.antMatchers("/seller/home").hasRole("SELLER")
		//.antMatchers("/seller/addproduct").hasRole("SELLER")
		.antMatchers("/seller/**").hasRole("SELLER")
		.antMatchers("/").permitAll()
		.and().formLogin().permitAll();		
	}
	
}
