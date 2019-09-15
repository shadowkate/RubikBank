package com.hcl.rubikbank.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Favourite implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer favouriteId;
	private String accountName;
	private String accountNumber;
	private String accountStatus;
	@CreationTimestamp
	private LocalDate creationDate;
	private Integer bankId;
	private Integer customerId;
	
	
	public Favourite() {
		// TODO Auto-generated constructor stub
	}
	public Favourite(Integer favouriteId, String accountName, String accountNumber, String accountStatus,
			LocalDate creationDate, Integer bankId, Integer customerId) {
		super();
		this.favouriteId = favouriteId;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountStatus = accountStatus;
		this.creationDate = creationDate;
		this.bankId = bankId;
		this.customerId = customerId;
	}
	public Integer getFavouriteId() {
		return favouriteId;
	}
	public void setFavouriteId(Integer favouriteId) {
		this.favouriteId = favouriteId;
	}
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
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	
}
