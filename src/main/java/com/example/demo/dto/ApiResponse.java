package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class ApiResponse {
	  @ApiModelProperty(value="Response code. 0 for success.", example="4000")
	  @JsonProperty
	  private int code;

	  @ApiModelProperty(value="Response message.", example="Invalid json content")
	  @JsonProperty
	  private String message;
	  
	}