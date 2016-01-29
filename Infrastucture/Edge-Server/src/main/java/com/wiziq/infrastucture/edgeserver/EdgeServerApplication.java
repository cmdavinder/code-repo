package com.wiziq.infrastucture.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.route.RibbonCommandFactory;
import org.springframework.cloud.netflix.zuul.filters.route.apache.HttpClientRibbonCommandFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
public class EdgeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdgeServerApplication.class, args);
    }
    
	@Bean
    public RibbonCommandFactory<?> ribbonCommandFactory(SpringClientFactory clientFactory) {
        return new HttpClientRibbonCommandFactory(clientFactory);
    }
}
