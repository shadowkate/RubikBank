package com.hcl.rubikbank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAccountResponseDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UpdateAccountResponseDto(String message) {
		this.message = message;
	}
	public UpdateAccountResponseDto() {
		// TODO Auto-generated constructor stub
	}
	
}
