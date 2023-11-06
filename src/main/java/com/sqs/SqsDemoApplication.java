package com.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication
public class SqsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqsDemoApplication.class, args);
	}

}
