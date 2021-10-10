package com.learnme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnme.externalmodels.TrendingMovies;
import com.learnme.model.Movie;
import com.learnme.model.PresentableTrendingMovies;
import com.learnme.service.InfoService;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping("trending/{type}/{timeWindow}")
	public PresentableTrendingMovies getMovie(@PathVariable("type") String type, @PathVariable("timeWindow") String timeWindow) {
		return infoService.getTrending(type, timeWindow);
	}
 
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return infoService.getMovieInfo(movieId);
	}
	
	@PostMapping(consumes = "application/json")
	public List<Movie> addMovieInfo(@RequestBody List<Movie> movie) {
		return infoService.addMovie(movie);
	}
}
