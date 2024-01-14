package com.springBoot.AmadeusCaseStudyApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HAVAALANI")
public class HAVAALANI {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue
	@Column(name = "ID")
	private int ID;
	
	@Column(name = "SEHIR")
	private String SEHIR;
	
	

    
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSEHIR() {
		return SEHIR;
	}
	public void setSEHIR(String sEHIR) {
		SEHIR = sEHIR;
	}	

}
