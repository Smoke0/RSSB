package com.sak.RSSB.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sak.RSSB.entities.Seats;
import com.sak.RSSB.repositories.SeatsRepo;

@RestController
public class SeatsResource {
	@Autowired
	SeatsRepo repo;
	
	@RequestMapping(value="seat",method=RequestMethod.GET)
	public List<Seats> getSeats(){
		return (List<Seats>)repo.findAll();
	}
	
	@RequestMapping(value="seat",method=RequestMethod.POST)
	public Seats addSeat(@RequestBody Seats seat){
		return repo.save(seat);
	}
}
