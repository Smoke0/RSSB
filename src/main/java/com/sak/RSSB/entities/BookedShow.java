package com.sak.RSSB.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class BookedShow {
	@Id
	private int id;
	private static final String TZ = "Asia/Kolkata";

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm:ss a z dd-MM-yyyy", timezone = TZ)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Booking_Time")
	private Date bookedTime;
	
	@OneToOne
	private Sow show;
	
	@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="id")
	@OneToMany(mappedBy="bookedShow")
	private List<Seats> seats;
	
	@JsonBackReference
	@ManyToMany(mappedBy="bookedShows")
	private List<User> users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBookedTime() {
		return bookedTime;
	}

	public void setBookedTime(Date bookedTime) {
		this.bookedTime = bookedTime;
	}

	public Sow getShow() {
		return show;
	}

	public void setShow(Sow show) {
		this.show = show;
	}

	public List<Seats> getSeats() {
		return seats;
	}

	public void setSeats(List<Seats> seats) {
		this.seats = seats;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
