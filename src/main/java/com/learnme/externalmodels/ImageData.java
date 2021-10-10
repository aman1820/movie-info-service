package com.learnme.externalmodels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageData {
	@JsonProperty("secure_base_url")
	private String secureBaseUrl;
	@JsonProperty("backdrop_sizes")
	private List<String> backdropSizes;
	@JsonProperty("logo_sizes")
	private List<String> logoSizes;
	@JsonProperty("poster_sizes")
	private List<String> posterSizes;
	
	public String getSecureBaseUrl() {
		return secureBaseUrl;
	}
	public void setSecureBaseUrl(String secureBaseUrl) {
		this.secureBaseUrl = secureBaseUrl;
	}
	public List<String> getBackdropSizes() {
		return backdropSizes;
	}
	public void setBackdropSizes(List<String> backdropSizes) {
		this.backdropSizes = backdropSizes;
	}
	public List<String> getLogoSizes() {
		return logoSizes;
	}
	public void setLogoSizes(List<String> logoSizes) {
		this.logoSizes = logoSizes;
	}
	public List<String> getPosterSizes() {
		return posterSizes;
	}
	public void setPosterSizes(List<String> posterSizes) {
		this.posterSizes = posterSizes;
	}
}
