package com.wiziq.compositeservice.course;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.netflix.zuul.filters.route.RibbonCommandFactory;
import org.springframework.cloud.netflix.zuul.filters.route.apache.HttpClientRibbonCommandFactory;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Created by dinkarthakur on 30/12/15.
 */
@SpringCloudApplication
@EnableFeignClients
public class CourseCreateApplication {
	
	@Bean(name = "messageSource")
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
		messageBundle.setBasename("classpath:i18n/resources");
		messageBundle.setDefaultEncoding("UTF-8");
		return messageBundle;
	}
	
	@Bean
    public RibbonCommandFactory<?> ribbonCommandFactory(SpringClientFactory clientFactory) {
        return new HttpClientRibbonCommandFactory(clientFactory);
    }

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CourseCreateApplication.class, args);
	}

}
