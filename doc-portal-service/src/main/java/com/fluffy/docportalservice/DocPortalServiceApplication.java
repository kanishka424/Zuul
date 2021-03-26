package com.fluffy.docportalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DocPortalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocPortalServiceApplication.class, args);
	}

}
