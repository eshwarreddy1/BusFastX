package com.hexaware.busfastx.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bus_Operators")
public class BusOperators {
	
	@Id
	private long operatorId;
    private String email;
    private String password;
    private String operatorName;
    private String contactNumber;
	private final String role = "BUSOPERATOR";
	public BusOperators() {
		super();
	}
	public BusOperators(long operatorId, String email, String password, String operatorName, String contactNumber) {
		super();
		this.operatorId = operatorId;
		this.email = email;
		this.password = password;
		this.operatorName = operatorName;
		this.contactNumber = contactNumber;
	}
	public long getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(long operatorId) {
		this.operatorId = operatorId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "BusOperators [operatorId=" + operatorId + ", email=" + email + ", password=" + password
				+ ", operatorName=" + operatorName + ", contactNumber=" + contactNumber + ", role=" + role + "]";
	}
	
	

}
