package com.tony.bootstrap.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class ResponseList {

	
	private List<ResponseModel> responses = new ArrayList<ResponseModel>();

	@JsonProperty("responselist")
	public List<ResponseModel> getList() {
		return responses;
	}

	public void setList(List<ResponseModel> list) {
		this.responses = list;
	}
	
	
}
