package com.learnme.externalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.learnme.externalmodels.PosterData;
import com.learnme.externalmodels.TrendingMovies;

@Service
public class moviewDBService {

	@Autowired
	@Qualifier("movieDBfilter")
	private WebClient webclient;
	
	public TrendingMovies getTrending(String type, String timeWindow) {
		return webclient.get()
				.uri("/trending/" + type + "/" + timeWindow)
				.header("Content-Type", "application/json;charset=utf-8")
				.retrieve()
				.bodyToMono(TrendingMovies.class)
				.block();
	}
	
	public PosterData getPosterData() {
		return webclient.get()
				.uri("/configuration")
				.header("Accept", "application/json")
				.retrieve()
				.bodyToMono(PosterData.class)
				.block();
	}
	
	
}
