package com.learnme.externalservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeanProvider {
	
	@Value("${bearer.token}")
	private String token;

	@Bean(name = "movieDBfilter")
	public WebClient getMovieDBWebclient() {
		return WebClient.builder()
				.baseUrl("https://api.themoviedb.org/3")
				.defaultHeaders(header -> header.setBearerAuth(token))
				.build();
		
				}
}
