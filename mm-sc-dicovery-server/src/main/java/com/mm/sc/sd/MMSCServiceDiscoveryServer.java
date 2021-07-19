/**
 * 
 */
package com.mm.sc.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dorak
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class MMSCServiceDiscoveryServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MMSCServiceDiscoveryServer.class, args);
	}

}
