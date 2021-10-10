package com.learnme.externalmodels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PosterData {
	@JsonProperty("images")
	private ImageData imageData;

	public ImageData getImageData() {
		return imageData;
	}

	public void setImageData(ImageData imageData) {
		this.imageData = imageData;
	}
	
}
