package com.javaweb.model.response;

import java.util.List;

public class ErrorResponse {
    private String error;
    private List<String> detail;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<String> getDetail() {
		return detail;
	}
	public void setDetail(List<String> detail) {
		this.detail = detail;
	}
    
    
    
}
