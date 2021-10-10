package com.learnme.externalmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TMDBMovie {
	@JsonProperty("poster_path")
	private String posterPath;
	private boolean adult;
	private String overview;
	@JsonProperty("release_date")
	private String releaseDate;
	private int id;
	private String title;
	private int popularity;
	@JsonProperty("vote_count")
	private int voteCount;
	@JsonProperty("vote_average")
	private int voteAverage;
	
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	public int getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}
	public int getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(int voteAverage) {
		this.voteAverage = voteAverage;
	}
	
	
}
