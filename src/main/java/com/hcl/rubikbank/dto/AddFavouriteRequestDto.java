package com.hcl.rubikbank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddFavouriteRequestDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountName;
	private String accountNumber;
	private String bankName;
	private Integer customerId;
	private Integer bankId;
	
	
	/*
	 * public AddFavouriteRequestDto(String accountName, String accountNumber,
	 * String bankName, Integer customerId, Integer bankId) { super();
	 * this.accountName = accountName; this.accountNumber = accountNumber;
	 * this.bankName = bankName; this.customerId = customerId; this.bankId = bankId;
	 * }
	 */
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	
	
}
