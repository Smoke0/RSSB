package com.sak.RSSB.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames= {"x","y"})})
public class Seats {
	@Id
	private int id;
	 @Column(columnDefinition="BOOLEAN") 
	 private boolean status;
	 private Position pos;
	 
	 @JsonBackReference
	 @ManyToOne
	 private BookedShow bookedShow;



	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public BookedShow getBookedShow() {
		return bookedShow;
	}

	public void setBookedShow(BookedShow bookedShow) {
		this.bookedShow = bookedShow;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	 
}
