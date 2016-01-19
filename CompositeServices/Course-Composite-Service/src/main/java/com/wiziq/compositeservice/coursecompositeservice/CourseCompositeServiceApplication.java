package com.wiziq.compositeservice.coursecompositeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CourseCompositeServiceApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CourseCompositeServiceApplication.class, args);
	}
	
	@Bean(name="messageSource")
	public ReloadableResourceBundleMessageSource messageSource(){		
		ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
		messageBundle.setBasename("classpath:messages/messages");
		messageBundle.setDefaultEncoding("UTF-8");
	    return messageBundle;
	}
}
