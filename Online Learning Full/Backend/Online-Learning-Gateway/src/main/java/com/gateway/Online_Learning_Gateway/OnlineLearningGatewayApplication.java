package com.gateway.Online_Learning_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineLearningGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineLearningGatewayApplication.class, args);
	}
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("online-learner-user", r -> r.path("/users/**")
						.uri("http://localhost:1111"))
				.route("course-service", r -> r.path("/courses/**")
						.uri("http://localhost:2222"))
				.route("classroom-service", r -> r.path("/classrooms/**")
						.uri("http://localhost:3333"))
				.route("assessment-service", r -> r.path("/assessments/**")
						.uri("http://localhost:4444"))
				.route("notification-service", r -> r.path("/notifications**")
						.uri("http://localhost:5555"))
				.build();
	} 	

}
