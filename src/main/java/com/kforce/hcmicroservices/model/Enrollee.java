package com.kforce.hcmicroservices.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HR.ENROLLEES")
public class Enrollee 
{
	@Id
    @GeneratedValue
    @Column(name="enrollee_id")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="activation_status")
	private String actStatus;
	@Column(name="birthDate")
	private Date birthDate;
	@Column(name="phone_number")
	private String phoneNo;
	//@Embedded
	private Dependent dependent;
	
	
	public Enrollee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Enrollee(String id, String name, String actStatus, Date birthDate, String phoneNo, Dependent dependent) {
		super();
		this.id = id;
		this.name = name;
		this.actStatus = actStatus;
		this.birthDate = birthDate;
		this.phoneNo = phoneNo;
		this.dependent = dependent;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getActStatus() {
		return actStatus;
	}


	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public Dependent getDependent() {
		return dependent;
	}


	public void setDependent(Dependent dependent) {
		this.dependent = dependent;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actStatus == null) ? 0 : actStatus.hashCode());
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((dependent == null) ? 0 : dependent.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollee other = (Enrollee) obj;
		if (actStatus == null) {
			if (other.actStatus != null)
				return false;
		} else if (!actStatus.equals(other.actStatus))
			return false;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (dependent == null) {
			if (other.dependent != null)
				return false;
		} else if (!dependent.equals(other.dependent))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Enrollee [id=" + id + ", name=" + name + ", actStatus=" + actStatus + ", birthDate=" + birthDate
				+ ", phoneNo=" + phoneNo + ", dependent=" + dependent + "]";
	}
	

}
