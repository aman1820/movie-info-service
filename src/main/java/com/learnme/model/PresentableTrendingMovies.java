package com.learnme.model;

import com.learnme.externalmodels.PosterData;
import com.learnme.externalmodels.TrendingMovies;

public class PresentableTrendingMovies {
	private TrendingMovies trendingMovies;
	private PosterData posterData;
	public TrendingMovies getTrendingMovies() {
		return trendingMovies;
	}
	public void setTrendingMovies(TrendingMovies trendingMovies) {
		this.trendingMovies = trendingMovies;
	}
	public PosterData getPosterData() {
		return posterData;
	}
	public void setPosterData(PosterData posterData) {
		this.posterData = posterData;
	}
	
}
