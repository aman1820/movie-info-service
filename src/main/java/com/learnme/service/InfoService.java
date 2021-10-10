package com.learnme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnme.externalmodels.TrendingMovies;
import com.learnme.externalservice.moviewDBService;
import com.learnme.model.Movie;
import com.learnme.model.PresentableTrendingMovies;
import com.learnme.repository.InfoRepo;

@Service
public class InfoService {

	@Autowired
	InfoRepo inforepo;
	
	@Autowired
	private moviewDBService externalMovieService;
	
	public PresentableTrendingMovies getTrending(String type, String timeWindow) {
		PresentableTrendingMovies presenTableTrendingMovie = new PresentableTrendingMovies();
		
		presenTableTrendingMovie.setTrendingMovies(externalMovieService.getTrending(type, timeWindow));
		presenTableTrendingMovie.setPosterData(externalMovieService.getPosterData());
		
		return presenTableTrendingMovie;
	}
	
	public Movie getMovieInfo(String movieId) {
		return inforepo.findById(movieId).get();
	}

	public List<Movie> addMovie(List<Movie> movie) {
		inforepo.saveAll(movie);
		return movie;
	}
	
}
