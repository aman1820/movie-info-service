package com.learnme.externalmodels;

import java.util.List;

public class TrendingMovies {
	private int page;
	private List<TMDBMovie> results;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<TMDBMovie> getResults() {
		return results;
	}
	public void setResults(List<TMDBMovie> results) {
		this.results = results;
	}
	
}
