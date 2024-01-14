package com.springBoot.AmadeusCaseStudyApi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "UCUSLAR")
public class UCUS 
{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue
	@Column(name = "ID")
	private int ID;
	
	@Column(name = "KALKISHAVAALANI")
	private String KALKISHAVAALANI;
	
	@Column(name = "VARISHAVAALANI")
	private String VARISHAVAALANI;
	
	@Column(name = "KALKISTARIH")
	private LocalDateTime  KALKISTARIH;
	
	@Column(name = "DONUSTARIH")
	private LocalDateTime  DONUSTARIH;
	
	@Column(name = "FIYAT")
	private double  FIYAT;
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getKALKISHAVAALANI() {
		return KALKISHAVAALANI;
	}

	public void setKALKISHAVAALANI(String kALKISHAVAALANI) {
		KALKISHAVAALANI = kALKISHAVAALANI;
	}

	public String getVARISHAVAALANI() {
		return VARISHAVAALANI;
	}

	public void setVARISHAVAALANI(String vARISHAVAALANI) {
		VARISHAVAALANI = vARISHAVAALANI;
	}

	public LocalDateTime getKALKISTARIH() {
		return KALKISTARIH;
	}

	public void setKALKISTARIH(LocalDateTime kALKISTARIH) {
		KALKISTARIH = kALKISTARIH;
	}

	public LocalDateTime getDONUSTARIH() {
		return DONUSTARIH;
	}

	public void setDONUSTARIH(LocalDateTime dONUSTARIH) {
		DONUSTARIH = dONUSTARIH;
	}

	public double getFIYAT() {
		return FIYAT;
	}

	public void setFIYAT(double fIYAT) {
		FIYAT = fIYAT;
	}

	
}	


