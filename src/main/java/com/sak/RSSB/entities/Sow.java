package com.sak.RSSB.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Sow {
	@Id
	@Column(name="Id")
	@GeneratedValue
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Rate")
	private int rate;
	
	private static final String TZ = "Asia/Kolkata";
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="hh:mm:ss a z dd-MM-yyyy",timezone=TZ)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date dateReserved;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Date getDateReserved() {
		return dateReserved;
	}

	public void setDateReserved(Date dateReserved) {
		this.dateReserved = dateReserved;
	}
	
	
}
