package org.mukesh.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Details")
public class UserDetails {
	
	@Id
	@Column
	private Long actorId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	@Column
	private String lastUpdate;
	
	public UserDetails(){
		
	}
	public UserDetails(Long actorId, String firstName, String lastName, String lastUpdate) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}
	
	public Long getActorId() {
		return actorId;
	}
	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
