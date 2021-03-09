package com.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseBean {

	private String output;

	public String getText() {
		return output;
	}

	@JsonProperty("output")
	public void setText(String text) {
		this.output = text;
	}
	
}
