package com.wiziq.microservice.course;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringCloudApplication
@EnableMongoAuditing
public class CourseApplication {


	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}
