/**
 * 
 */
package com.ts.sec.jdbc.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @author USER
 *
 */
@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public DataSource dataSource;

	@Bean
	public NoOpPasswordEncoder noopPasswordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.withDefaultSchema()
			.usersByUsernameQuery("select username, password, enabled from account_holders where username = ?")
			.authoritiesByUsernameQuery("select username, authority from roles where username = ?");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/users").hasRole("ADMIN")
		.antMatchers("/adminhome").hasRole("ADMIN")
		.antMatchers("/userhome").hasAnyRole("ADMIN", "USER")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
	
}
