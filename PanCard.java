package org.jsp.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	@GeneratedValue
	private int id;
	private String panNo;
	private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "PanCard [id=" + id + ", panNo=" + panNo + ", dob=" + dob + "]";
	}
	

}
